package main.java.com.example.demo;

// Concrete subject
public class StockPrice implements Subject {
    private List<Observer> observers;
    private double price;

    public StockPrice() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public double getPrice() {
        return price;
    }
}