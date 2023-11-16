package com.example.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("/Home")
    public String Home() {
        return "Home";
    }

}
