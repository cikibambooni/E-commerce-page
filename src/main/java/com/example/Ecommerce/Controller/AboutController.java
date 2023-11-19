package com.example.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
	public class AboutController {

	    @GetMapping("/About")
	    public String About() {
	        return "About";
	    }
}	
