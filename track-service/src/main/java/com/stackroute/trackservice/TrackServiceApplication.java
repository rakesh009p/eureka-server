package com.stackroute.trackservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//annotation added for swagger
@EnableSwagger2

@EnableDiscoveryClient
public class TrackServiceApplication {


	public static void main(String[] args) {

		SpringApplication.run(TrackServiceApplication.class, args);
	}

}
