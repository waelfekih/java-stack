package com.saveTravel.main.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.saveTravel.main.models.saveTravel;
import com.saveTravel.main.services.saveTravelService;

@RestController
@RequestMapping("/api/travels")
public class TravelApiController {

    private final saveTravelService saveTravelService;

    public TravelApiController(saveTravelService saveTravelService) {
        this.saveTravelService = saveTravelService;
    }

    // GET all travels
    @GetMapping
    public List<saveTravel> index() {
        return saveTravelService.allTravels();
    }

    // CREATE new travel
    @PostMapping
    public saveTravel create(
            @RequestParam("expense") String expense,
            @RequestParam("vendor") String vendor,
            @RequestParam("amount") Double amount,
            @RequestParam("description") String description) {
        saveTravel travel = new saveTravel(expense, vendor, amount, description);
        return saveTravelService.createTravel(travel);
    }

    // GET travel by ID
    @GetMapping("/{id}")
    public saveTravel show(@PathVariable("id") Long id) {
        return saveTravelService.findTravel(id);
    }

    // UPDATE travel by ID
    @PutMapping("/{id}")
    public saveTravel update(@PathVariable("id") Long id,
                         @RequestParam("expense") String expense,
                         @RequestParam("vendor") String vendor,
                         @RequestParam("amount") Double amount,
                         @RequestParam("description") String description) {
        saveTravel travel = new saveTravel(expense, vendor, amount, description);
        travel.setId(id);
        return saveTravelService.updateTravel(travel);
    }

    // DELETE travel by ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        saveTravelService.deleteTravel(id);
    }
}
