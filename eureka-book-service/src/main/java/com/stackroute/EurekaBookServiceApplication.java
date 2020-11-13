package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaBookServiceApplication.class, args);
	}

}
