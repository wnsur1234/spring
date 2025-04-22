package com.grepp.spring.infra.feign.client.busstop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusStopLocationApiTest {

    @Autowired
    BusStopLocationApi busStopLocationApi;
    
    @Value("bus-stop.apikey")
    String apiKey;
    
    @Test
    public void feignTest(){
        System.out.println(busStopLocationApi.getBusStop("6274784e696c6563373162656f584d",
            1,5));
    }

}