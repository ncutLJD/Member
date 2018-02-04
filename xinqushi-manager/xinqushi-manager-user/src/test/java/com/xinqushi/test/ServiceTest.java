package com.xinqushi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqushi.pojo.User;
import com.xinqushi.service.UserLoginService;
import com.xinqushi.utils.MemberResult;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ServiceTest {

	@Autowired
	private UserLoginService userLoginService;
	
	@Test
	public void UserLoginServiceTest(){
		MemberResult result = userLoginService.login("081", "ljd123456asd");
		System.out.println(result.getStatus());
		System.out.println(result.getData());
	}
}
