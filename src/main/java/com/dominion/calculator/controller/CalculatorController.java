package com.dominion.calculator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.dominion.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorController.class);

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public double add(@RequestParam double x, @RequestParam double y) {
        logger.info("Received request to add {} and {}", x, y);
        return calculatorService.add(x, y);
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double x, @RequestParam double y) {
        logger.info("Received request to subtract {} from {}", y, x);
        return calculatorService.subtract(x, y);
    }


    @GetMapping("/multiply")
    public double multitply(@RequestParam double x, @RequestParam double y) {
        logger.info("Received request to multiply {} and {}", x, y);
        return calculatorService.multiply(x, y);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double x, @RequestParam double y) {
        logger.info("Received request to divide {} by {}", x, y);
        return calculatorService.divide(x, y);
    }

    @GetMapping("/power")
    public double power(@RequestParam double base, @RequestParam double exponent) {
        logger.info("Received request to raise {} to the power of {}", base, exponent);
        return calculatorService.power(base, exponent);
    }


    @GetMapping("/sqrt")
    public double sqrt(@RequestParam double x) {
        logger.info("Received request to square {}", x);
        return calculatorService.sqrt(x);
    }

}
