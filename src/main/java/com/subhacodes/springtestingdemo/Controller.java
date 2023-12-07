package com.subhacodes.springtestingdemo;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class Controller {
    @Autowired
    private final GreetingService greetingService;
    
    @GetMapping("hello")
    public GreetingResponse sayHello(@RequestParam(name="name", required=false) String name) {
        log.info("Say Hello to Name: {}", name);
        String greeting = greetingService.sayHello(name);
        return new GreetingResponse(greeting);
    }
    
}
