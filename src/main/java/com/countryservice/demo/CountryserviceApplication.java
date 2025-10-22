package com.countryservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CountryserviceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CountryserviceApplication.class, args);
	}
	// Cette méthode est utilisée par Tomcat externe pour démarrer l'application
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CountryServiceApplication.class);
    }

}

