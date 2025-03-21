package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String helloWorld() {
        return "Hello, World! Meu nome é David Mendes!";
    }
}
