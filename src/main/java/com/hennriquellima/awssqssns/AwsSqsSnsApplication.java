package com.hennriquellima.awssqssns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.hennriquellima.awssqssns.AWS.SNSService.sendMessage;

@SpringBootApplication
public class AwsSqsSnsApplication {

	public static void main(String[] args){
		SpringApplication.run(AwsSqsSnsApplication.class, args);
	}

}
