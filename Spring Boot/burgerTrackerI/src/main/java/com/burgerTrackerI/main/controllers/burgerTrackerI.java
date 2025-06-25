package com.burgerTrackerI.main.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.burgerTrackerI.main.models.Burger;
import com.burgerTrackerI.main.services.BurgerTrackerIService;

@RestController
@RequestMapping("/api/burgers")
public class burgerTrackerI {

    private final BurgerTrackerIService burgerService;

    public burgerTrackerI(BurgerTrackerIService burgerService) {
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
            @RequestParam("rating") int rating) {
        Burger burger = new Burger(burgerName, restaurantName, rating);
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
                         @RequestParam("name") String burgerName,
                         @RequestParam("restaurant") String restaurantName,
                         @RequestParam("rating") int rating)
                          {
        Burger burger = new Burger(burgerName, restaurantName, rating);
        burger.setId(id);
        return burgerService.updateBurger(burger);
    }

    // Delete a burger
    @DeleteMapping("/{id}")
    public void destroy(@PathVariable("id") Long id) {
        burgerService.deleteBurger(id);
    }
}
