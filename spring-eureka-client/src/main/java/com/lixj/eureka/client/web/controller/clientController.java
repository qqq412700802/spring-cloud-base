package com.lixj.eureka.client.web.controller;

import com.lixj.eureka.client.api.TestFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientController {

    @Autowired
    private TestFacade testFacade;

    @RequestMapping("/hello")
    public String testClient(){
//        throw new NullPointerException();
        return "hello world1";
    }

    @RequestMapping("/eurekaHello")
    public String eurekaHello(){
        return testFacade.testClient();
    }
}
