package com.lixj.eureka.client.api.fallback.factory;

import com.lixj.eureka.client.api.TestFacade;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class TestFacadeFallbackFactory implements FallbackFactory<TestFacade> {
    @Override
    public TestFacade create(Throwable throwable) {
        return new TestFacade() {
            @Override
            public String testClient() {
                return throwable.getMessage();
            }
        };
    }
}
