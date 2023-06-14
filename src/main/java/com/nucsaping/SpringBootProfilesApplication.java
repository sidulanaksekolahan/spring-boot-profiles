package com.nucsaping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan()
@SpringBootApplication
public class SpringBootProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {

		return null;
	}

}
