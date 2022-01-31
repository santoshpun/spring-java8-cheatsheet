package com.santosh.springjava8cheatsheet.functionalinterface;

@FunctionalInterface
interface Operator<T> {
    T process(T a, T b);
}
