package com.example.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
	public class ContactController {

	    @GetMapping("/Contact")
	    public String Contact() {
	        return "Contact";
	    }
}
