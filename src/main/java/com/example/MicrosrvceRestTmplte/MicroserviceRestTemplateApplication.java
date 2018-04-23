package com.example.MicrosrvceRestTmplte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRestTemplateApplication.class, args);
	}
	
@RequestMapping("/temp")
public Temperature prudhivi() {
	
	Temperature abc=new Temperature();
	abc.setCelsius(45);
	abc.setCountry("India");
	return abc;
}

	
	
}
