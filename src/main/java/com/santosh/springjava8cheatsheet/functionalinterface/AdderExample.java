package com.santosh.springjava8cheatsheet.functionalinterface;

import org.springframework.stereotype.Component;

@Component
public class AdderExample {

    public void addTest() {
        Adder adder = (a, b) -> {
            int sum = a + b;
            System.out.println(String.format("Sum of %d and %d is %d", a, b, sum));
        };

        adder.add(1, 2);
        System.out.println(adder.add(1, 2, 3));
    }
}
