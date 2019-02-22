package com.example.Convertor.model;

public class Order {
    private Double value;
    private Currency fromCurrency;
    private Currency toCurrency;

    public Order(Double value, String fromCurrency, String toCurrency) {
        this.value = value;
        this.fromCurrency = Currency.valueOf(fromCurrency);
        this.toCurrency = Currency.valueOf(toCurrency);
    }

    public double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(Currency toCurrency) {
        this.toCurrency = toCurrency;
    }
}
