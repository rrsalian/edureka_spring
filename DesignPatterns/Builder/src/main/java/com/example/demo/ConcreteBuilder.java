package com.example.demo;

public class ConcreteBuilder extends Builder {
    private ComplexObject object = new ComplexObject();

    // methods for constructing the complex object
    public ComplexObject getResult() {
        return object;
    }
}
