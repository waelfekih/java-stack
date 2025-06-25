package com.burgerTrackerI.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import com.burgerTrackerI.main.models.Burger;
import com.burgerTrackerI.main.services.BurgerTrackerIService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
    private final BurgerTrackerIService burgerService;

    public BurgerController(BurgerTrackerIService burgerService) {
        this.burgerService = burgerService;
    }
    
    @GetMapping("/")
    public String home() {
    	return "redirect:/burgers" ;
    }

    @GetMapping("/burgers")
    public String index(Model model) {
    	model.addAttribute("burger", new Burger());
        List<Burger> burgers = burgerService.allBurgers();  
        model.addAttribute("burgers", burgers);
        return "index";
    }
    
    @PostMapping("/burgers")
    public String createBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("burgers", burgerService.allBurgers());
            return "index";
        }
        burgerService.createBurger(burger);
        return "redirect:/burgers";
    }
    
    
}
