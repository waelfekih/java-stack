package com.hoppersReceipt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller // <-- This allows the class to serve views
public class HoppersReceiptApplication {

    @RequestMapping("/")
    public String index(Model model) {
        String name = "Alex";
        String itemName = "Cables";
        double price = 8.5;
        String description = "Needed for some works";
        String vendor = "Electric Store";

        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);

        return "index"; // will be resolved to /WEB-INF/views/index.jsp
    }

    public static void main(String[] args) {
        SpringApplication.run(HoppersReceiptApplication.class, args);
    }
}
