package com.vaibhav.wsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceAppApplication.class, args);
	}
	
	
	/*@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}*/

}
