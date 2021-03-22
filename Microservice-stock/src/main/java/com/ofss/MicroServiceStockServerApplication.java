package com.ofss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

public class MicroServiceStockServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroServiceStockServerApplication.class, args);
	}
}
