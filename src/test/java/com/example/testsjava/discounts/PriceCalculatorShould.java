package com.example.testsjava.discounts;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriceCalculatorShould {
    PriceCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new PriceCalculator();
    }

    @Test
    public void total_zero_when_there_are_no_prices() {
        assertEquals(0.0, calculator.getTotal(), 0.001);
    }

    @Test
    public void total_is_the_sum_of_prices() {
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        assertEquals(25.7 ,calculator.getTotal(), 0.001);
    }

    @Test
    public void apply_discount_to_prices() {
        calculator.addPrice(12.5);
        calculator.addPrice(17.5);
        calculator.setDescount(25);
        assertEquals(22.5 ,calculator.getTotal(), 0.001);
    }
}