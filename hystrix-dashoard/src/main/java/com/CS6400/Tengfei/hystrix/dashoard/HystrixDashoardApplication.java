package com.CS6400.Tengfei.hystrix.dashoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class HystrixDashoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashoardApplication.class, args);
	}

}
