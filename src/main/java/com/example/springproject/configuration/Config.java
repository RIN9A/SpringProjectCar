package com.example.springproject.configuration;

import com.example.springproject.model.CPU;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class Config {
    @Bean
    public CPU cpu(){
        System.out.println("CPU is initializing");
        return new CPU();
    }
}
