package com.xinqushi.service.impl;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.util.StringUtils;
import com.xinqushi.entity.LoginUserInfo;
import com.xinqushi.mapper.AdminMapper;
import com.xinqushi.mapper.ClueMapper;
import com.xinqushi.mapper.ExperienceMapper;
import com.xinqushi.mapper.UserMapper;
import com.xinqushi.pojo.Admin;
import com.xinqushi.pojo.Clue;
import com.xinqushi.pojo.Experience;
import com.xinqushi.pojo.Member;
import com.xinqushi.pojo.User;
import com.xinqushi.service.UserLoginService;
import com.xinqushi.utils.JsonUtils;
import com.xinqushi.utils.MD5SaltUtils;
import com.xinqushi.utils.MemberResult;
import com.xinqushi.utils.UserType;

/**
 * 
 * @ClassName:  LoginServiceImpl   
 * @Description:用户登陆Service 
 * @author: lijunda
 * @date:   2018年1月27日 下午10:29:31
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private AdminMapper adminMapper;

	@Autowired
	private ClueMapper clueMapper;

	@Autowired
	private ExperienceMapper experienceMapper;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Value("${SESSION_PRE}")
	private String SESSION_PRE;

	@Value("${SESSION_EXPIRE}")
	private Integer SESSION_EXPIRE;

	
	@Override
	@Transactional
	public MemberResult login(String username, String password) {

		LoginUserInfo loginUserInfo = new LoginUserInfo();
		loginUserInfo.setPwd(password);
		if (username != null) {
			Object userClass = new Object();
			//判断登陆用户是否是管理员
			if ((userClass = adminMapper.getExist(username))!= null) {
				//先不管是超级管理员 还是 管理员 loginUserInfo的UserType先设置为ADMIN
				//在后面的操作中在确定是超级管理员还是管理员
				loginUserInfo.setUserType(UserType.getByValue(0));
				//判断登陆用户是否是Vip会员
			}else if ((userClass = userMapper.getExist(username))!= null) {
				loginUserInfo.setUserType(UserType.getByValue(2));
				//判断登陆用户是否是体验会员
			}else if ((userClass = experienceMapper.getExist(username)) != null) {
				loginUserInfo.setUserType(UserType.getByValue(3));
				//判断登陆用户是否是跟踪用户
			}else if ((userClass = clueMapper.getExist(username)) != null) {
				loginUserInfo.setUserType(UserType.getByValue(4));

				//登陆用户不存在
			}else {
				return MemberResult.build(400, "用户名错误!");
			}
			
			loginUserInfo.setUserClass(userClass);
		}

		switch (loginUserInfo.getUserType()) {
		case ADMIN:
			Admin admin = (Admin) loginUserInfo.getUserClass();
			loginUserInfo.setSalt(admin.getSalt());
			if (admin.getPwd().equals(MD5SaltUtils.encode(loginUserInfo))){
				loginUserInfo.setId(admin.getId());
				loginUserInfo.setName(admin.getRealname());
				loginUserInfo.setPhone(admin.getPhone());
				//Authority 0：管理员 1：超级管理员
				loginUserInfo.setUserType(UserType.getByValue(admin.getAuthority()));
			}
			break;
		case MEMBER:
			User member = (User) loginUserInfo.getUserClass();
			loginUserInfo.setSalt(member.getSalt());
			if (member.getPwd().equals(MD5SaltUtils.encode(loginUserInfo))) {
				loginUserInfo.setId(member.getId());
				loginUserInfo.setName(member.getMember().getName());
				loginUserInfo.setPhone(member.getMember().getMobile());
			}
			break;
		case EXPERIENCE:
			Experience experience = (Experience) loginUserInfo.getUserClass();
			loginUserInfo.setSalt(experience.getSalt());
			if (experience.getPassword().equals(MD5SaltUtils.encode(loginUserInfo))) {
				loginUserInfo.setId(experience.getId());
				loginUserInfo.setName(experience.getName());
				loginUserInfo.setPhone(experience.getPhone());
			}
			break;
		case CLUE:
			Clue clue = (Clue) loginUserInfo.getUserClass();
			if (clue.getQq().equals(loginUserInfo.getPwd())) {
				loginUserInfo.setId(clue.getId());
				loginUserInfo.setName(clue.getRealName());
				loginUserInfo.setPhone(clue.getPhone());
			}
		}
		
		if (0 == loginUserInfo.getId()) {
			return MemberResult.build(400, "密码错误");
		}
		//生成一个token
		String token = UUID.randomUUID().toString();
		
		// 把用户信息保存到Redis数据库里面去
        // key就是token，value就是用户对象转换成json
        // 为了安全，就不要把密码，slat和userClass保存到Redis数据库里面去，因此我们先把这几个内容置空 
		loginUserInfo.setPwd(null);
		loginUserInfo.setSalt(null);
		loginUserInfo.setUserClass(null);
		
		//向redis里存入数据和设置缓存时间
		stringRedisTemplate.opsForValue().set(SESSION_PRE+":"+token,
				JsonUtils.objectToJson(loginUserInfo),SESSION_EXPIRE,TimeUnit.SECONDS);
		
	    // 返回结果
        return MemberResult.ok(token);
	}

}
