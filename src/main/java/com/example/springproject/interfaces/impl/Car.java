package com.example.springproject.interfaces.impl;

import com.example.springproject.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public int getWheels() {
        return 4;
    }
}
