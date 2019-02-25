package com.example.Convertor.model;

public class Order {
    private Double value;
    private String fromCurrency;
    private String toCurrency;

    public Order(Double value, String fromCurrency, String toCurrency) {
        this.value = value;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }
}
