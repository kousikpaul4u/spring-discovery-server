package io.koushik.discoveryserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerDemoApplication.class, args);
	}
}
