package com.supplier.localsupplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LocalSupplierApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalSupplierApplication.class, args);
	}

}
