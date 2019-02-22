package com.example.Convertor.model;

public enum Currency {
    USD(1.0),
    EUR(0.9),
    PLN(3.8),
    RUB(60.0);

    private final Double rate;

    Currency(Double rate) {
        this.rate = rate;
    }


    public double getRate() {
        return this.rate;
    }
}