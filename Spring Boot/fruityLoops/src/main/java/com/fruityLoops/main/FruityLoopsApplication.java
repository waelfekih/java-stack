package com.fruityLoops.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;            
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class FruityLoopsApplication {

    @GetMapping("/")                       
    public String index(Model model) {
        List<Item> fruits = new ArrayList<>();

        fruits.add(new Item("Kiwi", 1.50));
        fruits.add(new Item("Mango", 2.00));
        fruits.add(new Item("Goji Berries", 4.00));
        fruits.add(new Item("Guava", 0.75));

        model.addAttribute("fruits", fruits); 
        return "index";                       
    }

    public static void main(String[] args) {
        SpringApplication.run(FruityLoopsApplication.class, args);
    }
}
