package com.microservices.mserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MServerApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MServerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MServerApplication.class, args);
	}
}
// public class MServerApplication {
//
// public static void main(String[] args) {
// SpringApplication.run(MServerApplication.class, args);
// }
// }
