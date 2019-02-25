package com.example.Convertor.service;

import com.example.Convertor.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class CurrencyService {
    @Autowired
    Map<String, Double> rates;

    Logger logger = LoggerFactory.getLogger(CurrencyService.class);

    public Double convert(Order order) {
        String curr = order.getFromCurrency() + order.getToCurrency();
        return rates.getOrDefault(curr, 1.0) * order.getValue();
    }
}
