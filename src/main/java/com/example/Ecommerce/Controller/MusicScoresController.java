package com.example.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
	public class MusicScoresController {

	    @GetMapping("/MusicScores")
	    public String MusicScores() {
	        return "MusicScores";
	    }
}
