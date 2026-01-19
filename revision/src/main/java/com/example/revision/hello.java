package com.example.revision;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/")
    public String hello(){
        return "This is revision of first class.";
    }
}
