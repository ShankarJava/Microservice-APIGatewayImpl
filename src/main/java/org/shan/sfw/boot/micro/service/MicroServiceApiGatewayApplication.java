package org.shan.sfw.boot.micro.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServiceApiGatewayApplication {

	public static void main(String[] args) {
		System.out.println("APIGateway");
		SpringApplication.run(MicroServiceApiGatewayApplication.class, args);
	}

}
