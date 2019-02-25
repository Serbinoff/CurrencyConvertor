package com.example.Convertor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import java.util.Map;

@SpringBootApplication
public class ConvertorApplication {

	@Bean
	@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Map<String, Double> rates() {
		Map<String, Double> rate = Map.of("USDEUR", 0.9, "USDPLN", 3.8, "EURUSD", 1.1,
				"EURPLN", 4.2, "PLNEUR", 0.23, "PLNUSD", 0.26);
	return rate;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConvertorApplication.class, args);
	}
}
