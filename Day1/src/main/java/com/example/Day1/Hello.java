package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hello(){
        return "This is first line";
    }
    @GetMapping("/name")
    public String name(){
        return "My name is Ajay Jaiswal";
    }
    @GetMapping("/address")
    public String address() {
        return "My Address is varanasi";
    }
}
