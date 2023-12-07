package com.subhacodes.springtestingdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Slf4j
public class GreetingService {

    @Autowired
    private final ApplicationProperties properties;
    
    public String sayHello(String name){
        log.info("Say Hello to Name from Service: {}", name);
        String s = name == null ? properties.getDefaultName() : name;

        return String.format("%s %s", properties.getGreeting(), s);
    }
}
