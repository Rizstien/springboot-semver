package com.example.semver.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloControllerV1 {
    @GetMapping
    public String hello() {
        return "Hello from API v1: fix: login button not working ";
    }
}
