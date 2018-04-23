package com.example.MicrosrvceRestTmplte2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceRestTemplate2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRestTemplate2Application.class, args);
		RestTemplate xyz=new RestTemplate();
		Temperature h=xyz.getForObject("http://localhost:8086/temp",Temperature.class);
		System.out.println(h.getCelsius()+ " " +h.getCountry());
	}
}
