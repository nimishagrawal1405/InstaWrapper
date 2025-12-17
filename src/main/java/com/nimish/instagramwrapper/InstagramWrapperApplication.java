package com.nimish.instagramwrapper;
// Hey Spring, start my application, configure everything automatically, and keep the server running

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstagramWrapperApplication {
	//This single annotation combines three annotations:
						   	// 1. @SpringBootConfiguration
							// 2. @EnableAutoConfiguration
							// 3. @ComponentScan
	
	public static void main(String[] args) {
		 SpringApplication.run(InstagramWrapperApplication.class, args);

	}

}
