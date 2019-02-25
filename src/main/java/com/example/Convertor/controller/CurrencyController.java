package com.example.Convertor.controller;

import com.example.Convertor.model.Order;
import com.example.Convertor.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path="/")
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    Logger logger = LoggerFactory.getLogger(CurrencyController.class);

    @PostMapping("convertor")
    public Double convert(@RequestBody Order order){
        return currencyService.convert(order);
    }

    @GetMapping("convertor")
    public ResponseEntity healthCheck(){
        logger.info("The endpoint is alive!");
        return ResponseEntity.status(200).build();
    }
}
