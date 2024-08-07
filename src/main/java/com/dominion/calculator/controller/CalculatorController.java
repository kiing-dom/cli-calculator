package com.dominion.calculator.controller;

import org.springframework.web.bind.annotation.*;

import com.dominion.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public double add(@RequestParam double x, @RequestParam double y) {
        return calculatorService.add(x, y);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double x, @RequestParam double y) {
        return calculatorService.subtract(x, y);
    }


    @GetMapping("/multiply")
    public double multitply(@RequestParam double x, @RequestParam double y) {
        return calculatorService.multiply(x, y);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double x, @RequestParam double y) {
        return calculatorService.divide(x, y);
    }

    @GetMapping("/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        return calculatorService.power(base, exponent);
    }


    @GetMapping("/sqrt")
    public double sqrt(@RequestParam double x) {
        return calculatorService.sqrt(x);
    }

}
