package com.simplilearn.petadoption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.petadoption"+"com.simplilearn.petadoption.controllers"+"com.simplilearn.petadoption.dto"+"com.simplilearn.petadoption.Models"+"com.simplilearn.petadoption.repositories"+"com.simplilearn.petadoption.services")
public class PetadoptionApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.location", "application.properties");
		SpringApplication.run(PetadoptionApplication.class, args);
	}

}
