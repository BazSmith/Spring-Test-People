package com.uk.sky.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PeopleApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(PeopleApplication.class, args);

	}

}