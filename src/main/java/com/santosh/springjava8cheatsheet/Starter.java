package com.santosh.springjava8cheatsheet;

import com.santosh.springjava8cheatsheet.datetime.DatetimeExample1;
import com.santosh.springjava8cheatsheet.functionalinterface.*;
import com.santosh.springjava8cheatsheet.optional.OptionalExample1;
import com.santosh.springjava8cheatsheet.streamapi.StreamExample1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    //Functional interface
    @Autowired
    private DrawableExample drawableExample;
    @Autowired
    private PrintableExample printableExample;
    @Autowired
    private AdderExample adderExample;
    @Autowired
    private RunnableExample runnableExample;
    @Autowired
    private LambdaExample1 lambdaExample1;

    //Stream API
    @Autowired
    private StreamExample1 streamExample1;

    //Java 8 Optional class
    @Autowired
    private OptionalExample1 optionalExample1;

    // DateTime API
    @Autowired
    private DatetimeExample1 datetimeExample1;

    @Override
    public void run(String... args) throws Exception {

        this.functionalInterfaceExamples();
        this.streamAPIExamples();
        this.optionalObjectExamples();
        this.datetimeExamples();
    }

    private void functionalInterfaceExamples() {
        System.out.println("===== Functional Interface examples =======");
        drawableExample.drawableTest();
        printableExample.printTest();
        adderExample.addTest();
        runnableExample.runTest();
        lambdaExample1.test();
    }

    private void streamAPIExamples() {
        System.out.println("===== Stream API examples =======");
        streamExample1.test();
    }

    private void optionalObjectExamples() {
        System.out.println("===== Java 8 Optional class examples =======");
        optionalExample1.test();
    }

    private void datetimeExamples() {
        System.out.println("===== Java 8 DateTime API examples =======");
        datetimeExample1.test();
    }
}
