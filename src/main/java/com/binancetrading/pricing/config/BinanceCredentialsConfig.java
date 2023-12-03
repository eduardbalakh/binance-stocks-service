package com.binancetrading.pricing.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class BinanceCredentialsConfig {

    @Value("${binance.credentials.apiKey}")
    public String apiKey;

    @Value("${binance.credentials.secretKey}")
    public String secretKey;

    @Value("${binance.baseUrl}")
    public String baseUrl;


}
