package br.com.alura.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsAluraEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAluraEurekaApplication.class, args);
	}

}
