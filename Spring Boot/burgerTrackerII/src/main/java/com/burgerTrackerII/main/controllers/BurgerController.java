package com.burgerTrackerII.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;

import com.burgerTrackerII.main.models.Burger;
import com.burgerTrackerII.main.services.BurgerTrackerIIService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
    private final BurgerTrackerIIService burgerService;

    public BurgerController(BurgerTrackerIIService burgerService) {
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
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Burger> burgers = burgerService.allBurgers();
            model.addAttribute("burgers", burgers);
            return "index";
        }
        burgerService.createBurger(burger);
        return "redirect:/burgers";
    }
    
    @GetMapping("/burgers/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Burger burger = burgerService.findBurger(id);
        if (burger == null) {
            return "redirect:/burgers";
        }
        model.addAttribute("burger", burger);
        return "edit";
    }

    // Handle update form submission
    @PostMapping("/burgers/{id}/update")
    public String update(@PathVariable("id") Long id,
                         @Valid @ModelAttribute("burger") Burger burger,
                         BindingResult result,
                         Model model) {

        if (result.hasErrors()) {
            model.addAttribute("burger", burger);
            return "edit";
        }

        burger.setId(id);
        burgerService.updateBurger(burger);
        return "redirect:/burgers";
    }
    

}