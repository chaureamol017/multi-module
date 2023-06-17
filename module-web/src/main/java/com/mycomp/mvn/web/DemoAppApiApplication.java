package com.mycomp.mvn.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.mycomp.mvn.*"})
//@EntityScan(basePackages = {"com.mycomp.mvn.*"})
//@EnableJpaRepositories(basePackages = {"com.mycomp.mvn.*"})
public class DemoAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApiApplication.class, args);
	}

}
