package com.girish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootSpringDataApplication extends SpringBootServletInitializer  {
	
	@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(SpringBootSpringDataApplication.class);
	 }
    
	public static void main(String[] args) {
		System.out.println("testing123");
		SpringApplication.run(SpringBootSpringDataApplication.class, args);
	}

	

}
