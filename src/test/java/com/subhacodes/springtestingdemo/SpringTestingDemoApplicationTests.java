package com.subhacodes.springtestingdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SpringTestingDemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void shouldReturnGreetingSuccessfully() throws Exception{
		mockMvc.perform(get("/api/hello?name={name}", "Subha"))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.name", is("Hello Subha")));
	}

}
