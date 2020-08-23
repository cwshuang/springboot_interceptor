package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.User;
import com.example.mapper.UserMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
class LearnSpringbootApplicationTests {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testUser() {
		//User user = new User(null, "张三", "123123", "用户内容");
		//userMapper.insert(user);
		User user = userMapper.selectById(1);
		System.out.println(">>>>>>>>>>"+user);
	}

	@Test
	void contextLoads() {

	}

}
