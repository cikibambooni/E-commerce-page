package com.example.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
	public class VideoController {

	    @GetMapping("/Video")
	    public String Video() {
	        return "Video";
	    }
}
