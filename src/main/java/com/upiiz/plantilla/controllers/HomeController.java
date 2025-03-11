package com.upiiz.plantilla.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class HomeController {
    @GetMapping
    public String home() {
        return "index";
    }
    @GetMapping("/elements")
    public String elements() {
        return "elements";
    }
    @GetMapping("/generic")
    public String generics(){
        return "generic";
    }
}
