package com.example.demo;

public class TaxCalculator implements ITaxCalculator{
    
    public double calculateTax(double loanAmount) {
        return 0.1 * loanAmount;
    }
}
