package com.sidenow.freshgreenish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FreshgreenishApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshgreenishApplication.class, args);
	}

}
