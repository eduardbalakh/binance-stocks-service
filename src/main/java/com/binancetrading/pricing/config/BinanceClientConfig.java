package com.binancetrading.pricing.config;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BinanceClientConfig {

    @Bean
    public SpotClient getSpotClient(BinanceCredentialsConfig credentialsConfig) {
        return new SpotClientImpl(credentialsConfig.apiKey, credentialsConfig.secretKey, credentialsConfig.baseUrl);
    }

}
