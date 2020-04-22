package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qa.demo.data.domain.Train;
import com.qa.demo.data.repo.TrainRepo;

@SpringBootApplication
public class SpringExampleApplication {

	//bean -> managed object
	//IoC -> Inversion of Control -> program manages objects for developer
	//Repository -> Abstraction to database logic
	//Service    -> Business logic
	//Controller -> gateway to front end
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringExampleApplication.class, args);
		TrainRepo repo = ac.getBean(TrainRepo.class);
		repo.save(new Train("Thomas", "blue"));
	}
}
