package com.example.Hello_World;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping
    public String sayHello() {
        return "Hello World!";
    }
}
