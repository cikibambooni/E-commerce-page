package com.example.Ecommerce.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
	public class ContactController {

	    @GetMapping("/Contact")
	    public String Contact(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	    	model.addAttribute("name", name);
	        return "Contact";
	    }
}
