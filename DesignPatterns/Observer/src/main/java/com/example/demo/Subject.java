package main.java.com.example.demo;

// Subject interface
public interface Subject {    
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
