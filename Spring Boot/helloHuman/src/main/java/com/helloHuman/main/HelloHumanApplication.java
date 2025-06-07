package com.helloHuman.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class HelloHumanApplication {
	
	@GetMapping("/")
	public String helloHuman() {
		return "Hello Human" ;
	}
	
	@RequestMapping("/hello")
    public String helloName(
    		@RequestParam(value="name") String searchQuery,
    		@RequestParam(value="lastName", required=false) String lastName ,
			@RequestParam(value= "times" , required = false, defaultValue="1") int times) {
		String fullName = searchQuery + " " + lastName + "" ;
	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < times; i++) {
	        result.append("Hello ").append(fullName).append("\n");
	    }

	    return result.toString();


		
    }

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}

}
