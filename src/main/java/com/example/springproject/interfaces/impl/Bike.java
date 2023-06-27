package com.example.springproject.interfaces.impl;

import com.example.springproject.interfaces.Vehicle;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Primary
public class Bike implements Vehicle {
    @Override
    public int getWheels() {
        return 2;
    }
}
