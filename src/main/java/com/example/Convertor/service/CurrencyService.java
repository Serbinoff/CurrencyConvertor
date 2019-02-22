package com.example.Convertor.service;

import com.example.Convertor.model.Order;

public class CurrencyService {
    public static Double convert(Order order) {
        return order.getToCurrency().getRate() * order.getValue();
    }
}
