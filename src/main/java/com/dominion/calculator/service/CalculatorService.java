package com.dominion.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if(y == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }

        return x / y;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double a) {
        if(a < 0) {
            throw new IllegalArgumentException("Can't square a negative number " + "Try the square root of " + (a * -1));
        }
        return Math.sqrt(a);
    }
}
