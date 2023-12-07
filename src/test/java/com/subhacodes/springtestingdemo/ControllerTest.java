package com.subhacodes.springtestingdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private GreetingService greetingService;

    @Test
    void shouldReturnGreetingSuccessfully() throws Exception{

        given(greetingService.sayHello("Subha")).willReturn("Hello Subha");

        mockMvc.perform(get("/api/hello?name={name}","Subha"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.name", is("Hello Subha")));
    }
}
