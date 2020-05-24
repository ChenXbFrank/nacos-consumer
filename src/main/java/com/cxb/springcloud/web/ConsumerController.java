package com.cxb.springcloud.web;

import com.cxb.springcloud.config.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    /*@Autowired
    RestTemplate restTemplate;

   *//**
     * 这里是Ribbon调用服务
     * @return
     *//*
    @GetMapping("/hi-resttemplate")
    public String hiResttemplate() {
        return restTemplate.getForObject("http://nacos-provider/hi?name=resttemplate", String.class);

    }*/

    @Autowired
    ProviderClient providerClient;

    @GetMapping("/hi-feign")
    public String hiFeign(){
        return providerClient.hi("feign");
    }

}

