package com.example.Ecommerce.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    @GetMapping("/Home")
    public String Home (Model model) {
    model.addAttribute("name" );
    model.addAttribute("text2");
    model.addAttribute("text3");
    	return "Home";
    }

    
    
}
