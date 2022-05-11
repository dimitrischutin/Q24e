package com.company;

public class Person implements StringTransformerService {
    String name;

    @Override
    public String transform(String string) {
        return "Nicht aufgepasst " + string + " Pech gehanbt " + string + " nichts verstanden";
    }
}
