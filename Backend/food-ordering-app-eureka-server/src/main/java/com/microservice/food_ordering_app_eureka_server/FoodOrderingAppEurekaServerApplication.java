package com.microservice.food_ordering_app_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FoodOrderingAppEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderingAppEurekaServerApplication.class, args);
	}

}
