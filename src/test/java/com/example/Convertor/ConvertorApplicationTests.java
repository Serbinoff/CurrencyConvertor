package com.example.Convertor;

import com.example.Convertor.model.Order;
import com.example.Convertor.service.CurrencyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConvertorApplication.class)
@WebAppConfiguration
public class ConvertorApplicationTests {
    @Autowired
    CurrencyService currencyService;

    @Test
    public void convertToPLN(){
        Order order = new Order(100.0, "USD", "PLN");
        double res = currencyService.convert(order);
        assertEquals(res, 380, 0.0001);
    }
}
