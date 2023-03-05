package com.girish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class SpringBootSpringDataApplication extends SpringBootServletInitializer  {
public class SpringBootSpringDataApplication  {
	
	/*@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(SpringBootSpringDataApplication.class);
	 }*/
    
	public static void main(String[] args) {
		System.out.println("testing");
		SpringApplication.run(SpringBootSpringDataApplication.class, args);
	}

	

}
