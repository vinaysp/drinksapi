package com.northcoders.drinksapi.service;

import com.northcoders.drinksapi.model.Tea;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class TeaService{

    private final AtomicLong idCounter = new AtomicLong();

    public Tea makeNewTea(String name){
        return new Tea(idCounter.incrementAndGet(),name);
    }

}
