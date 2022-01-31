package com.santosh.springjava8cheatsheet.functionalinterface;

import org.springframework.stereotype.Component;

@Component
public class PrintableExample {

    public void printTest() {
        Printable printable = (message) -> message + " called";
        String printMessage = printable.print("Print method");
        System.out.println(printMessage);
    }
}
