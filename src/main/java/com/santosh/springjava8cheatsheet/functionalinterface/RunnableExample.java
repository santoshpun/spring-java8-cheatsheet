package com.santosh.springjava8cheatsheet.functionalinterface;

import org.springframework.stereotype.Component;

@Component
public class RunnableExample {

    public void runTest() {
        Runnable runnable = () -> {
            System.out.println("Runnable thread run method called");
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
