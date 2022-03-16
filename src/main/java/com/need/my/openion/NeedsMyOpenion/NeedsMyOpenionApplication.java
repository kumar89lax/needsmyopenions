package com.need.my.openion.NeedsMyOpenion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class NeedsMyOpenionApplication {

	  private static final Logger LOGGER = LogManager.getLogger(NeedsMyOpenionApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(NeedsMyOpenionApplication.class, args);
		
	}

}
