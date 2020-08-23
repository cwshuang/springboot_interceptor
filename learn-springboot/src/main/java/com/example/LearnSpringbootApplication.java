package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper") //*是通配符
public class LearnSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringbootApplication.class, args);
	}

}
