package com.algorithmsassignment.models;

public class Company {
    double sharePrice;
    boolean stockRoseToday;

    // Parameterized constructor
    public Company(double sharePrice, boolean stockRoseToday) {
        this.sharePrice = sharePrice;
        this.stockRoseToday = stockRoseToday;
    }

    // Get sharePrice
    // This is used to get the price of share in a single element of the companies
    // array
    public double getSharePrice() {
        return this.sharePrice;
    }

    // Get status of stock
    // This is used to get the price of share in a single element of the companies
    // array
    public boolean getStockRoseToday() {
        return this.stockRoseToday;
    }

}
