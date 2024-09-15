package com.example.demo.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/v1/hello")
    public String sayHello() {
        return "Hello world!";
    }
}
