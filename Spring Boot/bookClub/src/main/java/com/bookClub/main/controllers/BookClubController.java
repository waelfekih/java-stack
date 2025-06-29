package com.bookClub.main.controllers;


import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookClub.main.models.BookClub;
import com.bookClub.main.models.LoginUser;
import com.bookClub.main.models.User;
import com.bookClub.main.services.BookClubService;
import com.bookClub.main.services.UserService;

@Controller
public class BookClubController {

	// Add once service is implemented:
	@Autowired
	private UserService users;
	@Autowired
	private BookClubService books;
    
    @GetMapping("/")
    public String index(Model model) {
    
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        
        // Call a register method in the service 
        // to do some extra validations and create a new user!
    	User user = users.register(newUser, result);
    	
        
        if(result.hasErrors()) {
            // Be sure to send in the empty LoginUser before 
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "index";
        }
        
        // No errors! 
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.
        session.setAttribute("userId", user.getId());
    
        return "redirect:/books";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
        // Add once service is implemented:
        User user = users.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index";
        }
    
        // No errors! 
        // Store their ID from the DB in session, 
        // in other words, log them in.
        session.setAttribute("userId", user.getId());
    
        return "redirect:/books";
    }
    
    @GetMapping("/books")
    public String home(Model model, HttpSession session) {
    	
    	if(session.getAttribute("userId") == null) {
    		return "redirect:/";
    	}
    	
    	model.addAttribute("books", books.all());
    	model.addAttribute("user", users.findById((Long)session.getAttribute("userId")));
    	return "books";
    }
    
    @GetMapping("/books/new")
    public String addPage(Model model, HttpSession session) {
        model.addAttribute("book", new BookClub()); 
        User user = users.findById((Long)session.getAttribute("userId"));
        model.addAttribute("user", user);
        return "create";
    }

    @PostMapping("/books/create")
    public String createBook(@Valid @ModelAttribute("book") BookClub book, BindingResult result) {
        if (result.hasErrors()) {
            return "create"; 
        }
        books.create(book);
        return "redirect:/books";
    }

    
    @GetMapping("/books/{id}")
    public String showPage(@PathVariable("id") Long id, Model model, HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        if (userId == null) {
            return "redirect:/";
        }

        BookClub book = books.findById(id);
        User user = users.findById(userId);

        if (book == null) {
            return "redirect:/books"; 
        }

        model.addAttribute("book", book);
        model.addAttribute("user", user);

        return "showOne"; 
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}