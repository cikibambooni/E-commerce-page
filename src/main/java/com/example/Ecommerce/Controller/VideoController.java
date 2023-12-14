package com.example.Ecommerce.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
	public class VideoController {

	    @GetMapping("/Video")
	    public String Video(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	    	model.addAttribute("name", name);
	        return "Video";
	    }
}
