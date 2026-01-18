package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/addition")
    public double add(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }
    @GetMapping("/subtraction")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

}
