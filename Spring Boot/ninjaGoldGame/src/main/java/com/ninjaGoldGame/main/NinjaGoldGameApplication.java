package com.ninjaGoldGame.main;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
public class NinjaGoldGameApplication {

    @GetMapping("/")
    public String index() {
        return "index";  // Show the form
    }

    @PostMapping("/farm")
    public String farm(@RequestParam("gold") Integer goldInput, HttpServletRequest request, Model model) {
    	
    	String timestamp = LocalDateTime
    			.now(ZoneId.of("Africa/Tunis"))
    			.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        model.addAttribute("gold", goldInput);
        model.addAttribute("timestamp", timestamp);     


        if (goldInput >= 10) {
            int earnedGold = (int) (Math.random() * 11) + 10; 
            int newGold = goldInput + earnedGold;
            model.addAttribute("earnedGold", earnedGold);
            model.addAttribute("newGold", newGold);
        } else {
            model.addAttribute("message", "Gold must be between 10 and 20 to farm!");
        }

        return "index";
    }
    
    @PostMapping("/cave")
    public String cave(@RequestParam("gold") Integer goldInput, HttpServletRequest request, Model model) {

        model.addAttribute("gold", goldInput);

        if (goldInput >= 5) {
            int earnedGold = (int) (Math.random() * 6) + 5; 
            int newGold = goldInput + earnedGold;
            model.addAttribute("earnedGold", earnedGold);
            model.addAttribute("newGold", newGold);
        } else {
            model.addAttribute("message", "Gold must be between 5 and 10 to farm!");
        }

        return "index";
    }
    
    @PostMapping("/house")
    public String house(@RequestParam("gold") Integer goldInput, HttpServletRequest request, Model model) {

        model.addAttribute("gold", goldInput);

        if (goldInput >= 5) {
            int earnedGold = (int) (Math.random() * 4) + 2; 
            int newGold = goldInput + earnedGold;
            model.addAttribute("earnedGold", earnedGold);
            model.addAttribute("newGold", newGold);
        } else {
            model.addAttribute("message", "Gold must be between 2 and 5 to farm!");
        }

        return "index";
    }
    
    @PostMapping("/quest")
    public String quest(@RequestParam("gold") Integer goldInput, HttpServletRequest request, Model model) {

        model.addAttribute("gold", goldInput);

        if (goldInput >= 50) {
            int earnedGold = (int) (Math.random() * 4) + 2; 
            int newGold = goldInput + earnedGold;
            model.addAttribute("earnedGold", earnedGold);
            model.addAttribute("newGold", newGold);
        } else {
            model.addAttribute("message", "Gold must be between  and 50 to farm!");
        }

        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(NinjaGoldGameApplication.class, args);
    }
}
