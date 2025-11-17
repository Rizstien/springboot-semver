package com.example.semver.controller.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/hello")
public class HelloControllerV2 {
    @GetMapping
    public Message hello() {
        return new Message("Hello from API v2", 21);
    }

    record Message(String message, int apiLevel) {}
}
