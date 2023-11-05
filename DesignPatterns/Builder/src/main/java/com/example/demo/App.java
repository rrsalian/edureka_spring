package com.example.demo;

public class App {
    public static void main(String[] args) {
        // create the director
        Director director = new Director();

        // create the builder
        Builder builder = new ConcreteBuilder();

        // construct the complex object
        director.construct(builder);

        // retrieve the finished product
        ComplexObject complexObject = builder.getResult();
    }
}
