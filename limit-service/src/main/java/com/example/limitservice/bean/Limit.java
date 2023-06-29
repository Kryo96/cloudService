package com.example.limitservice.bean;

import lombok.Data;

@Data
public class Limit {
    private int min;
    private int max;

    public Limit(int min,  int max) {
        this.min = min;
        this.max = max;
    }
}
