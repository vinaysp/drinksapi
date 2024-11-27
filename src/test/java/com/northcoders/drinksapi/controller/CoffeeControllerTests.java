package com.northcoders.drinksapi.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class CoffeeControllerTests {

    @Autowired
    private MockMvc mockMvcController;

    @Test
    public void testGetCoffeeLover() throws Exception {

        String expectedContent = "I like coffee";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffeelover"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedContent));
    }

    @Test
    public void testGetCoffee_emptyParam() throws Exception {

        int expectedId = 1;
        String expectedValue = "latte";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffee").param(""))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expectedValue))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(expectedId));
    }

    @Test
    public void testGetCoffee_userInput() throws Exception {

        int expectedId = 2;
        String expectedValue = "cappuccino";

        this.mockMvcController.perform(
                        MockMvcRequestBuilders.get("/coffee").param("cappuccino"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(expectedValue))
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(expectedId));
    }
}
