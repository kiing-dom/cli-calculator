package com.dominion.calculator.service;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CalculatorService {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public double add(double x, double y) {
        double result = x + y;
        logger.info("Adding {} and {}: {}" , x, y, result);
        return result;
    }

    public double subtract(double x, double y) {
        double result = x - y;
        logger.info("Subtracting {} from {}: {}" , y, x, result);
        return result;
    }

    public double multiply(double x, double y) {
        double result = x * y;
        logger.info("Multiplying {} and {}: {}" , x, y, result);
        return result;
    }

    public double divide(double x, double y) {
        if(y == 0) {
            logger.error("Can't divide by zero");
            throw new IllegalArgumentException("Can't divide by zero");
        }

        double result = x / y;
        logger.info("Dividing {} by {}: {}", x, y, result);
        return result;
    }

    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        logger.info("Calculating {} to the power of {}: {}", base, exponent, result);
        return result;
    }

    public double sqrt(double a) {
        if(a < 0) {
            logger.error("Can't square a negative number " + "Try the square root of " + (a * -1));
            throw new IllegalArgumentException("Can't square a negative number " + "Try the square root of " + (a * -1));
        }
        double result = Math.sqrt(a);
        logger.info("Calculating the square of {}: {}", a, result);
        return result;
    }
}
