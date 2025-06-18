package com.omikujiForm.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class MainController {
	@GetMapping("/omikuji")
	public String omikuji() {
		return "form" ;
	}
	
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
        // Get attributes from session and pass to model
        model.addAttribute("num", session.getAttribute("num"));
	    model.addAttribute("city", session.getAttribute("city"));
	    model.addAttribute("person", session.getAttribute("person"));
	    model.addAttribute("hobby", session.getAttribute("hoppy"));
	    model.addAttribute("thing", session.getAttribute("thing"));
	    model.addAttribute("comment", session.getAttribute("comment"));
	        
	    	return "show";
	}
	
	@PostMapping("/omikuji/show")
	public String newForm (@RequestParam("num") String num,
		    @RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hoppy") String hoppy,
			@RequestParam("thing") String thing,
			@RequestParam("comment") String comment, HttpSession session) {
		
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hoppy", hoppy);
		session.setAttribute("thing", thing);
		session.setAttribute("comment", comment);
		
		return "redirect:/omikuji/show" ;
		
		
	}

}
