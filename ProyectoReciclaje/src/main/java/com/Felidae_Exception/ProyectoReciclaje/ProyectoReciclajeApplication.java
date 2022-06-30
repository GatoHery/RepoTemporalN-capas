package com.Felidae_Exception.ProyectoReciclaje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ProyectoReciclajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoReciclajeApplication.class, args);
	}

}
