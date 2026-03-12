package com.jarvis.java8.Features.controller;

import com.jarvis.java8.Features.ServiceImple.OptionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OptionalController {

    private final OptionalService optionalService;

    @Autowired
    public OptionalController(OptionalService service) {
        this.optionalService=service;
    }

    @GetMapping("/java8/optional")
    public void optionalMethods() throws Exception {
        optionalService.optionalTest();
    }
}
