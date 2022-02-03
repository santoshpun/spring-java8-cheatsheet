package com.santosh.springjava8cheatsheet.optional;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OptionalExample1 {

    public void test() {
        // Optional.empty() method is useful to create an empty Optional object.
        Optional<String> empty = Optional.empty();
        // Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false.
        System.out.println(empty.isPresent());

        String name1 = "Santosh";
        Optional<String> opt = Optional.of(name1);
        System.out.println(opt.isPresent());

        // Optional.ofNullable() method returns
        // a Non-empty Optional if a value present in the given object. Otherwise returns empty Optional.
        String name2 = null;
        Optional<String> optNullable = Optional.ofNullable(name2);
        System.out.println(optNullable.isPresent());

        // Default value with orElse
        String nullName = null;
        String name3 = Optional.ofNullable(nullName).orElse("john");

        Optional<String> opt1 = Optional.of("Santosh");
        // Optional.get() returns the actual value from Optional object.
        // If optional has null value means it is empty. In such a case, NoSuchElementException is thrown.
        String name4 = opt1.get();
    }
}
