package com.odx.test.controller;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.odx.test.service.TestService;

@WebMvcTest(TestController.class)
public class TestControllerTest {
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	TestService service;
	
    @AfterEach
    void tearDown() {
        reset(service);
    }
	
	@Test
	public void getLongestPalindromicSubstring_should_return_longestPalindromicSubstring() throws Exception {
		String input = "something";
		String palin = "s";
		when(service.getLongestPalindromicSubstring(input)).thenReturn(palin);
		
		mockMvc.perform(get("/palin/" + input)
      	      .contentType(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$.inputString", is(input)))
      .andExpect(jsonPath("$.longestPalindromicSubstring", is(palin)));;
	}
	
}
