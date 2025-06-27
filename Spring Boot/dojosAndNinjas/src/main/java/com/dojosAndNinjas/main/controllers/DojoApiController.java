package com.dojosAndNinjas.main.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.dojosAndNinjas.main.models.Dojo;
import com.dojosAndNinjas.main.services.DojoService;

@RestController
@RequestMapping("/api/dojos")
public class DojoApiController {

    private final DojoService dojoService;

    public DojoApiController(DojoService dojoService) {
        this.dojoService = dojoService;
    }

    // GET all dojos
    @GetMapping
    public List<Dojo> index() {
        return dojoService.findAll();
    }

    // CREATE new dojo
    @PostMapping
    public Dojo create(@RequestParam("name") String name) {
        Dojo dojo = new Dojo();
        dojo.setName(name);
        return dojoService.create(dojo);
    }

    // GET dojo by ID
    @GetMapping("/{id}")
    public Dojo show(@PathVariable("id") Long id) {
        return dojoService.findById(id);
    }
}
