package com.example.testsjava.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
    private List<Double> prices = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {
        Double total = prices.stream().reduce(0.0, Double::sum);
        return total - (total * (discount / 100));
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDescount(double discount) {
        this.discount = discount;
    }
}
