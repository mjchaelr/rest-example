package com.mjchael.rest.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello-world")
    public String getSampleMessage(){
        return "Hello, this is a sample message";
    }
}
