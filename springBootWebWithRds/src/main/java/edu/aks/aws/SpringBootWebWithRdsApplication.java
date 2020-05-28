package edu.aks.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWebWithRdsApplication extends SpringBootServletInitializer { // AWS

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebWithRdsApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebWithRdsApplication.class, args);
	}

}
