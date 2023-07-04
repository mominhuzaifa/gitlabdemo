package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class azure {
    @GetMapping("/azure")
    public String getData() {
        return "azure";
    }
}
