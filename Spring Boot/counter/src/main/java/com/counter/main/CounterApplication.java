package com.counter.main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class CounterApplication {
	 @GetMapping("/")                       
	    public String index() {
		 return "index";
	 }
	 
	 @GetMapping("/date")
	 	public String date(Model model) {
		 LocalDateTime now = LocalDateTime.now();

		    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, d MMM yyyy");

		    model.addAttribute("currentDate", now.format(fmt));
		 return "date" ;
	 }
	
	 @GetMapping("/time")
	 	public String time(Model model) {
		 LocalDateTime now = LocalDateTime.now();

		    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("h:mm a");

		    model.addAttribute("currentTime", now.format(fmt));
		 return "time" ;
	 }
	 
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}

}
