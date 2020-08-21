package br.com.itau.mastertech.distribute.tracing.address.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AddressApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApiApplication.class, args);
	}

}
