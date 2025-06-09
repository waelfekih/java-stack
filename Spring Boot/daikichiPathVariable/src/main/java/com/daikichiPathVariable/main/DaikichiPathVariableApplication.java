package com.daikichiPathVariable.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
@RequestMapping("/daikichi")

public class DaikichiPathVariableApplication {
    @GetMapping("/travel/{city}")
    public String helloCity(@PathVariable("city") String city) {
        return "Congratulations! You will soon travel to " + city;
    }
    
    @GetMapping("/lotto/{num}")
    public String lotto(@PathVariable("num") int num) {
    	if (num % 2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers";
    	} else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
    //	return "Today you will find luck in all your endeavors!" ;
   // }
    
  //  @GetMapping("/tomorrow")
   // public String tomorrow() {
    //	return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!. " ;
  //  }

    public static void main(String[] args) {
        SpringApplication.run(DaikichiPathVariableApplication.class, args);
    }
}
