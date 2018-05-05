package com.lixj.eureka.client.api;

import com.lixj.eureka.client.api.fallback.factory.TestFacadeFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "spring-eureka-client",fallbackFactory = TestFacadeFallbackFactory.class)
public interface TestFacade {
    @RequestMapping("/hello")
    public String testClient();
}
