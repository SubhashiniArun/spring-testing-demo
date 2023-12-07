package com.subhacodes.springtestingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class SpringTestingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestingDemoApplication.class, args);
	}

}
