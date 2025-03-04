package com.assignment.Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		UserInformationService userInformationService = context.getBean(UserInformationService.class);

		String developerName = userInformationService.getInformation();
		System.out.println("Developer Name: " + developerName);


	}

}
