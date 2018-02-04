package com.xinqushi.entity;


import com.xinqushi.utils.UserType;

/**
 * 
 * @ClassName:  LoginUserInfo   
 * @Description:存登陆用户的信息
 * @author: lijunda
 * @date:   2018年1月26日 下午8:15:29
 */
public class LoginUserInfo {
	//用户id
	private int id;
	//用户密码
	private String pwd;
	//用户姓名
	private String name;
	//盐
	private String salt;
	//用户类型
	private UserType userType;
	//电话号码
	private String phone;
	
	private Object userClass;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	public Object getUserClass() {
		return userClass;
	}
	public void setUserClass(Object userClass) {
		this.userClass = userClass;
	}
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "LoginUserInfo [id=" + id + ", pwd=" + pwd + ", name=" + name + ", salt=" + salt + ", userType="
				+ userType + ", phone=" + phone + ", userClass=" + userClass + "]";
	}

}
