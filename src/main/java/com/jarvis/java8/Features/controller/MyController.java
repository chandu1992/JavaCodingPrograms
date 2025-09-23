package com.jarvis.java8.Features.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/name")
    public String getMyName(){
        return "chandra";
    }
}
