package com.example.demo;

public class NewTaxCalculator implements ITaxCalculator{
    public double calculateTax(double loanAmount) {
        return 0.15 * loanAmount;
    }
}
