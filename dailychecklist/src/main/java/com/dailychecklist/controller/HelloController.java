package com.dailychecklist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")   // providing   path that is /hello.
    public String hello() {
        return ("Hello");
    }
    
    @PostMapping("/about")
    public String about(){
        return "About Information";
    }
}

