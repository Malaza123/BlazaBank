package com.blazabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.crypto.bcrypt.BCrypt;
// import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootApplication
public class BlazaBankApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(BlazaBankApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BlazaBankApplication.class, args);

	}
//	String password = BCrypt.hashpw("password123", BCrypt.gensalt());
//System.out.println("password");
}
