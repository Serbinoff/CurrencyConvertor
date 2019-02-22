package com.example.Convertor.controller;

import com.example.Convertor.model.Order;
import com.example.Convertor.service.CurrencyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/")
public class CurrencyController {
    @PostMapping("convertor")
    public Double convert(@RequestBody Order order){
        return CurrencyService.convert(order);
    }
}
