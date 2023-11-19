package com.example.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BackingTracksController {

    @GetMapping("/BackingTracks")
    public String BackingTracks() {
        return "BackingTracks";
    }

}
