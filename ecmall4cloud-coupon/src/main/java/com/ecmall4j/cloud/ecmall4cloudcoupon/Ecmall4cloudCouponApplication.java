package com.ecmall4j.cloud.ecmall4cloudcoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Ecmall4cloudCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ecmall4cloudCouponApplication.class, args);
    }

}
