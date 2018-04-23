package com.egiants.techno.jetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JettyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JettyApplication.class, args);
}
	@RestController
 class hai {
		@RequestMapping("/name")
	public String hello() {
		
		return "Hai";
	}

	
	
}


}
