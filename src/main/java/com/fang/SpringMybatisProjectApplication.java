package com.fang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fang.DAO")
public class SpringMybatisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisProjectApplication.class, args);
	}
}
