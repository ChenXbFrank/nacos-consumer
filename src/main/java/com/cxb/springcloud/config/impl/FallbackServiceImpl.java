package com.cxb.springcloud.config.impl;


import com.cxb.springcloud.config.ProviderClient;
import org.springframework.stereotype.Component;

@Component
public class FallbackServiceImpl implements ProviderClient {

    @Override
    public String hi(String name) {
        return "熔断返回的值";
    }
}
