package com.northcoders.drinksapi.service;

import com.northcoders.drinksapi.model.Coffee;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class CoffeeService {

    private final AtomicLong idCounter = new AtomicLong();

    public Coffee makeNewCoffee(String name){
        return new Coffee(idCounter.incrementAndGet(),name);
    }

}
