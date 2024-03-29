package com.org.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class OrgEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgEurekaApplication.class, args);
	}

}
