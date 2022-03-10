package com.jenkins.example.jenkinsdemo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DemoController.class)
public class DemoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void serviceShouldReturn200() throws Exception {
        this.mockMvc.perform(get("/demo")).andExpect(status().isOk()).andExpect(content().string(containsString("Hello World")));
    }
}
