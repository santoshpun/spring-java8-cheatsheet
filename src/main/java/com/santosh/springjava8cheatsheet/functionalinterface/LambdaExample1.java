package com.santosh.springjava8cheatsheet.functionalinterface;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LambdaExample1 {

    public void test() {
        // example1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        // Using lambda expression to print all elements of list
        numbers.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements of list
        numbers.forEach(n -> {
            if (n % 2 == 0) System.out.println(n);
        });

        // example2
        Operator<Integer> addOperation = (a, b) -> a + b;
        System.out.println(addOperation.process(3, 3));
    }
}
