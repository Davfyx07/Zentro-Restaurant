package com.ZentroRestaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.model")
@EnableJpaRepositories(basePackages = "com.repository")
public class ZentroRestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZentroRestaurantApplication.class, args);
	}

}
