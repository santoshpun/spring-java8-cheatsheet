package com.santosh.springjava8cheatsheet.functionalinterface;

@FunctionalInterface
public interface Adder {

    void add(int a, int b);

    default int add(int a, int b, int c) {
        return a + b + c;
    }
}
