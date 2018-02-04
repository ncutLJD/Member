package com.xinqushi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqushi.mapper.UserMapper;
import com.xinqushi.pojo.User;
import com.xinqushi.utils.UserType;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MybatisTests {

	
	@Test
	public void selectUserByNameOrPhone(){
		
		UserType userType = UserType.getByValue(0);
		switch (userType) {
		case ADMIN:
			System.out.println("admin");
			break;

		default:
			System.out.println("null");
			break;
		}
	}
}
