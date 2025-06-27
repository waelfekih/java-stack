package com.dojosAndNinjas.main.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.dojosAndNinjas.main.models.Ninja;
import com.dojosAndNinjas.main.models.Dojo;
import com.dojosAndNinjas.main.services.NinjaService;
import com.dojosAndNinjas.main.services.DojoService;

@RestController
@RequestMapping("/api/ninjas")
public class NinjaApiController {

    private final NinjaService ninjaService;
    private final DojoService dojoService;

    public NinjaApiController(NinjaService ninjaService, DojoService dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    // GET all ninjas
    @GetMapping
    public List<Ninja> index() {
        return ninjaService.findAll();
    }

    // CREATE new ninja
    @PostMapping
    public Ninja create(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("age") int age,
            @RequestParam("dojoId") Long dojoId) {
        Dojo dojo = dojoService.findById(dojoId);
        Ninja ninja = new Ninja();
        ninja.setFirstName(firstName);
        ninja.setLastName(lastName);
        ninja.setAge(age);
        ninja.setDojo(dojo);
        return ninjaService.create(ninja);
    }

    // GET ninja by ID
    @GetMapping("/{id}")
    public Ninja show(@PathVariable("id") Long id) {
        return ninjaService.findById(id);
    }
}
