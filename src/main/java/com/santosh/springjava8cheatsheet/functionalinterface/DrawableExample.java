package com.santosh.springjava8cheatsheet.functionalinterface;

import org.springframework.stereotype.Component;

@Component
public class DrawableExample {

    public void drawableTest() {
        // <parameter_list> -> expression
        Drawable drawable = () -> {
            System.out.println("Draw method called");
        };

        drawable.draw();

        Drawable drawable1 = () -> System.out.println("Draw method called");
        drawable1.draw();
    }
}
