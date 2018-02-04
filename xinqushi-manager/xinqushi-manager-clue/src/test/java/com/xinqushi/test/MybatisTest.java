package com.xinqushi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqushi.mapper.ClueMapper;
import com.xinqushi.pojo.Clue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MybatisTest {

	@Autowired
	private ClueMapper clueMapper;
	
	@Test
	public void selectClue(){
	}
	
	
}
