package com.subhacodes.springtestingdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GreetingServiceTest {
    
    @Mock
    private ApplicationProperties properties;

    @InjectMocks
    private GreetingService greetingService;

    @BeforeEach
    void setUp(){
        given(properties.getGreeting()).willReturn("Hello");
    }

    @Test
    void shouldGreetWithDefaultNameWhenNameIsNotProvided(){
        given(properties.getDefaultName()).willReturn("World");

        String greeting = greetingService.sayHello(null);

        Assertions.assertEquals("Hello World", greeting); // jUnit based Assertion
        assertThat(greeting).isEqualTo("Hello World"); // assertj based Assertion
    }

    @Test
    void shouldGreetWithGivenName(){
        String greeting = greetingService.sayHello("Subha");

        assertThat(greeting).isEqualTo("Hello Subha");
    }

}
