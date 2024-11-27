package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import com.northcoders.drinksapi.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @Autowired
    CoffeeService coffeeService;

    @GetMapping(value = "/coffeelover")
    public String getCoffeeLover() {
        return "I like coffee";
    }

    @GetMapping(value = "/coffee")
    public ResponseEntity<Coffee> Coffee(@RequestParam(defaultValue = "latte") String name) {
        return new ResponseEntity<>(coffeeService.makeNewCoffee(name), HttpStatus.OK);
    }
}
