package com.saveTravel.main.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;

import com.saveTravel.main.models.saveTravel;
import com.saveTravel.main.repositories.saveTravelRepository;
import com.saveTravel.main.services.saveTravelService;

import jakarta.validation.Valid;

@Controller
public class saveTravelController {
    private final saveTravelService saveTravelService;

    public saveTravelController(saveTravelService saveTravelService) {
        this.saveTravelService = saveTravelService;
    }
    
    @GetMapping("/")
    public String home() {
    	return "redirect:/expenses" ;
    }

    @GetMapping("/expenses")
    public String index(Model model) {
    	model.addAttribute("travel", new saveTravel());
        List<saveTravel> saveTravel = saveTravelService.allTravels();  
        model.addAttribute("travels", saveTravel);
        return "index";
    }
    
    @PostMapping("/expenses")
    public String create(
            @Valid @ModelAttribute("travel") saveTravel saveTravel,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            List<saveTravel> travels = saveTravelService.allTravels();
            model.addAttribute("travels", travels); 
            return "index";
        }

        saveTravelService.createTravel(saveTravel);
        return "redirect:/expenses";
    }
    
    @GetMapping("/expenses/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        saveTravel saveTravel = saveTravelService.findTravel(id);
        if (saveTravel == null) {
            return "redirect:/expenses";
        }
        model.addAttribute("travel", saveTravel); 
        return "edit";
    }
    
    @PostMapping("/expenses/update/{id}")
    public String update(@PathVariable("id") Long id,
                         @Valid @ModelAttribute("travel") saveTravel saveTravel,
                         BindingResult result,
                         Model model) {
        if (result.hasErrors()) {
            model.addAttribute("travel", saveTravel);
            return "edit";
        }

        saveTravel.setId(id);
        saveTravelService.updateTravel(saveTravel);
        return "redirect:/expenses";
    }
    
    //show one expense
    @GetMapping("/expenses/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        saveTravel travel = saveTravelService.findTravel(id);
        if (travel == null) {
            return "redirect:/expenses";
        }
        model.addAttribute("travel", travel);
        return "showOne";
    }
    
    //delete expense
    @GetMapping("/expenses/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        saveTravelService.deleteTravel(id);
        return "redirect:/expenses";
    }
    
    public void deleteTravel(Long id) {
        saveTravelService.deleteTravel(id);
    }


    
    
    

}