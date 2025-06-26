package com.burgerTrackerII.main.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.burgerTrackerII.main.models.Burger;
import com.burgerTrackerII.main.services.BurgerTrackerIIService;

@RestController
@RequestMapping("/api/burgers")
public class burgerTrackerII {

    private final BurgerTrackerIIService burgerService;

    public burgerTrackerII(BurgerTrackerIIService burgerService) {
        this.burgerService = burgerService;
    }

    @GetMapping
    public List<Burger> index() {
        return burgerService.allBurgers();
    }

    @PostMapping
    public Burger create(
            @RequestParam("burgerName") String burgerName,
            @RequestParam("restaurantName") String restaurantName,
            @RequestParam("rating") int rating,
            @RequestParam("notes") String notes) {
        Burger burger = new Burger(burgerName, restaurantName, rating, notes);
        return burgerService.createBurger(burger);
    }


    // Show a burger by ID
    @GetMapping("/{id}")
    public Burger show(@PathVariable("id") Long id) {
        return burgerService.findBurger(id);
    }

    // Update a burger
    @PutMapping("/{id}")
    public Burger update(@PathVariable("id") Long id,
                         @RequestParam("burgerName") String burgerName,
                         @RequestParam("restaurantName") String restaurantName,
                         @RequestParam("rating") int rating ,
                         @RequestParam("notes") String notes)
                          {
        Burger burger = new Burger(burgerName, restaurantName, rating, notes);
        burger.setId(id);
        return burgerService.updateBurger(burger);
    }

   
}