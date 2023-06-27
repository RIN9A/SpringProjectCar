package com.example.springproject.configuration;


import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class CPUConfig {
    CPUConfig(Map<String, String> map){
        System.out.println(map.keySet().iterator().next());
    }
}
