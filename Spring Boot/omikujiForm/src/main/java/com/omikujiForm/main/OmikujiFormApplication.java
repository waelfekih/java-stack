package com.omikujiForm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class OmikujiFormApplication {
	
	// ...


	public static void main(String[] args) {
		SpringApplication.run(OmikujiFormApplication.class, args);
	}

}
