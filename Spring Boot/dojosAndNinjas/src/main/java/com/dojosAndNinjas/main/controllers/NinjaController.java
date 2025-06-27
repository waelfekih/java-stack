package com.dojosAndNinjas.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.dojosAndNinjas.main.models.Ninja;
import com.dojosAndNinjas.main.models.Dojo;
import com.dojosAndNinjas.main.services.NinjaService;
import com.dojosAndNinjas.main.services.DojoService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;
    private final DojoService dojoService;

    public NinjaController(NinjaService ninjaService, DojoService dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    // Show form to create ninja and list all ninjas
    @GetMapping
    public String index(Model model) {
        model.addAttribute("ninja", new Ninja());
        model.addAttribute("dojos", dojoService.findAll());
        model.addAttribute("ninjas", ninjaService.findAll());
        return "ninja"; // your JSP page for ninja list + create form
    }

    // Process ninja creation form
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("ninja") Ninja ninja,
                         BindingResult result,
                         Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", dojoService.findAll());
            model.addAttribute("ninjas", ninjaService.findAll());
            return "ninja";
        }
        ninjaService.create(ninja);
        return "redirect:/ninjas";
    }

    // Show details for one ninja by ninja ID
    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Ninja ninja = ninjaService.findById(id);
        if (ninja == null) {
            return "redirect:/ninjas";
        }
        model.addAttribute("ninja", ninja);
        return "show"; // your JSP page for ninja details
    }

    // Optional: delete ninja by ID
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        ninjaService.delete(id);
        return "redirect:/ninjas";
    }
}
