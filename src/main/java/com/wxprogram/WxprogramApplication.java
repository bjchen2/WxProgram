package com.wxprogram;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//dao层下的类由mapper实现
@MapperScan("com.wxprogram.dao")
@RestController
public class WxprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxprogramApplication.class, args);
	}
}
