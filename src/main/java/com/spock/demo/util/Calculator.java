package com.spock.demo.util;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public float div(int a, int b) {
        return a / b;
    }


}
