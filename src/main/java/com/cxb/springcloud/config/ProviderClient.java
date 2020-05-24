package com.cxb.springcloud.config;

import com.cxb.springcloud.config.impl.FallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-provider", fallback = FallbackServiceImpl.class)
public interface ProviderClient {

    @GetMapping("/hi")
    String hi(@RequestParam(value = "name", defaultValue = "frank", required = false) String name);
}
