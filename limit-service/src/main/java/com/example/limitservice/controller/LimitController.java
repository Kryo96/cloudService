package com.example.limitservice.controller;

import com.example.limitservice.bean.Limit;
import com.example.limitservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limit getLimits(){
        return new Limit(configuration.getMin(), configuration.getMax());
       // return new Limit(1, 1000);
    }
}
