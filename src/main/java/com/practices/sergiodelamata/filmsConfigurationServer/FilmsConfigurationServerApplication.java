package com.practices.sergiodelamata.filmsConfigurationServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FilmsConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmsConfigurationServerApplication.class, args);
	}

}
