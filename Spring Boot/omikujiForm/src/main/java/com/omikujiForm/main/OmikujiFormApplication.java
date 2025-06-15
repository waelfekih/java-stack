package com.omikujiForm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class OmikujiFormApplication {
	@GetMapping("/omikuji")
	public String omikuji() {
		return "form" ;
	}
	
	// ...
	@RequestMapping("/omikuji/show")
	public String login(
		@RequestParam("num") String num,
	    @RequestParam("city") String city,
		@RequestParam("person") String person,
		@RequestParam("hoppy") String hoppy,
		@RequestParam("thing") String thing,
		@RequestParam("comment") String comment,
		Model model){
			
			model.addAttribute("num", num);
	        model.addAttribute("city", city);
	        model.addAttribute("person", person);
	        model.addAttribute("hobby", hoppy);
	        model.addAttribute("thing", thing);
	        model.addAttribute("comment", comment);
	        
	    	return "show";
	}
	// ...


	public static void main(String[] args) {
		SpringApplication.run(OmikujiFormApplication.class, args);
	}

}
