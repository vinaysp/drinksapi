package com.northcoders.drinksapi.controller;

import com.northcoders.drinksapi.model.Coffee;
import com.northcoders.drinksapi.model.Tea;
import com.northcoders.drinksapi.service.CoffeeService;
import com.northcoders.drinksapi.service.TeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeaController {

    @Autowired
    TeaService teaService;

    @GetMapping(value = "/tealover")
    public String getTeaLover() {
        return "I like tea";
    }

    @GetMapping(value = "/tea")
    public ResponseEntity<Tea> Tea(@RequestParam(defaultValue = "green tea") String name) {
        return new ResponseEntity<Tea>(teaService.makeNewTea(name), HttpStatus.OK);
    }

}
