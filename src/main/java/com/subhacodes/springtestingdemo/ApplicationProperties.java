package com.subhacodes.springtestingdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class ApplicationProperties {
    private String greeting = "Hello";
    private String defaultName = "World";
}
