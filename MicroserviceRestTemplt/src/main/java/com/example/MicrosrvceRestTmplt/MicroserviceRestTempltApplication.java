package com.example.MicrosrvceRestTmplt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceRestTempltApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRestTempltApplication.class, args);
	}
	@RequestMapping("/temp")
	public Temperature prudhivi() {
	Temperature abc = new Temperature();
	abc.setCelsius(41);
	abc.setCountry("India");
	return abc;
}
}
