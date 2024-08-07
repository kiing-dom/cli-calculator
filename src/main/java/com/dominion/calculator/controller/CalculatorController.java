package com.dominion.calculator.controller;

import org.springframework.web.bind.annotation.*;

import com.dominion.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private CalculatorService calculatorService;

    @GetMapping("/add")
    public double add(@RequestParam double x, double y) {
        return calculatorService.add(x, y);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double x, double y) {
        return calculatorService.subtract(x, y);
    }


    @GetMapping("/multiply")
    public double multitply(@RequestParam double x, double y) {
        return calculatorService.multiply(x, y);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double x, double y) {
        return calculatorService.divide(x, y);
    }

    @GetMapping("/power")
    public double power(@RequestParam double base, double exponent) {
        return calculatorService.power(base, exponent);
    }


    @GetMapping("/sqrt")
    public double sqrt(@RequestParam double x) {
        return calculatorService.sqrt(x);
    }

}
