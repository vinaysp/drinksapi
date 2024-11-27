package com.northcoders.drinksapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @GetMapping(value = "/coffeelover")
    public String getCoffeeLover() {
        return "I like coffee";
    }

    @GetMapping(value = "/coffee")
    public ResponseEntity<String> getCoffee(@RequestParam String name) {


    }
}
