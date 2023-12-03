package com.binancetrading.pricing.service;

import com.binance.connector.client.SpotClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BinanceService implements InitializingBean {

    private final SpotClient spotClient;

    public String getAllExchanges() {
        return "";
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(spotClient.createMarket().ping());
    }
}
