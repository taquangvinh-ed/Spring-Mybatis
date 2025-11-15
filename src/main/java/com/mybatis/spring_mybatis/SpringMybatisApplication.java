package com.mybatis.spring_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.spring_mybatis.mapper")
public class SpringMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisApplication.class, args);
	}

}
