package com.piyush.basic_springboot_ioc_di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicSpringbootIocDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringbootIocDiApplication.class, args);
	}

	/*
	* - Initially no statement will be printed
	* - To tell container to create and save bean is context use @Component, @Service, @Controller
	* */
}
