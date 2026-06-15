package com.payal.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello Payal, Maven-based Java application is running on AKS!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}
