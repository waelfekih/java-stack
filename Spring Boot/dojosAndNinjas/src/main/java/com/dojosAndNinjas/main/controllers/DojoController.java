package com.dojosAndNinjas.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.dojosAndNinjas.main.models.Dojo;
import com.dojosAndNinjas.main.services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {
    private final DojoService dojoService;

    public DojoController(DojoService dojoService) {
        this.dojoService = dojoService;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/dojos";
    }

    @GetMapping("/dojos")
    public String index(Model model) {
        model.addAttribute("dojo", new Dojo());
        model.addAttribute("dojos", dojoService.findAll());
        return "dojo";
    }

    @PostMapping("/dojos/create")
    public String create(@Valid @ModelAttribute("dojo") Dojo dojo,
                         BindingResult result,
                         Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", dojoService.findAll());
            return "dojo";
        }

        dojoService.create(dojo);
        return "redirect:/ninjas";
    }

    @GetMapping("/dojos/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Dojo dojo = dojoService.findById(id);
        if (dojo == null) {
            return "redirect:/dojos";
        }
        model.addAttribute("dojo", dojo);
        return "show";
    }

    @GetMapping("/dojos/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        // Optional: implement dojoService.delete(id);
        return "redirect:/dojos";
    }
}
