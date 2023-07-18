package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GCP {
    @GetMapping("/GCP - Google Cloud Computing")
    public String getData() {
        return "aws";
    }
}
