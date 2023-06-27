package com.example.springproject.model;

public class CPU {
    private String processor;
    private int generation;

    public CPU(String processor, int generation){
        this.processor = processor;
        this.generation = generation;
    }

    public CPU() {
    }


    public String getInfo() {
        return "info";
    }
}
