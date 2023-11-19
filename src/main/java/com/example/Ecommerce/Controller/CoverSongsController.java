package com.example.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
	public class CoverSongsController {

	    @GetMapping("/CoverSongs")
	    public String CoverSongs() {
	        return "CoverSongs";
	    }
}
