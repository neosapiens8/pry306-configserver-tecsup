package com.codigotecsup.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableConfigServer
//@EnableEurekaClient
// A partir de 2021 en lugar de @EnableEurekaClient se usa @EnableDiscoveryClient
@EnableDiscoveryClient
@SpringBootApplication

public class ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}

}
