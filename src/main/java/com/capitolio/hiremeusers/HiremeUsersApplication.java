package com.capitolio.hiremeusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HiremeUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiremeUsersApplication.class, args);
	}

}
