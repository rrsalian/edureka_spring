package com.example.demo;

/*
 * The singleton design pattern is a creational design pattern 
 * that ensures that a class has only one instance while providing 
 * a global access point to this instance.
 * The singleton pattern is often used when a single object is needed 
 * to coordinate actions across the system.
 * 
 */

import main.java.com.example.demo.Singleton;

public class App {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        
        System.out.println("Singleton Class instance " + Singleton.getInstance());
        System.out.println(singleton);
    }
}
