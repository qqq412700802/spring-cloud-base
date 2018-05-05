package com.lixj.eureka.client.api.fallback;

import com.lixj.eureka.client.api.TestFacade;
import org.springframework.stereotype.Component;

@Component
public class TestFacadeFallback implements TestFacade {
    @Override
    public String testClient() {
        return "调用失败";
    }
}
