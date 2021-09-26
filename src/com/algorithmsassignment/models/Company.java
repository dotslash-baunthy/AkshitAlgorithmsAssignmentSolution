package com.algorithmsassignment.models;

public class Company {
    double sharePrice;
    boolean stockRoseToday;

    public Company (int sharePrice, boolean stockRoseToday) {
        this.sharePrice = sharePrice;
        this.stockRoseToday = stockRoseToday;
    }

    public double getSharePrice() {
        return this.sharePrice;
    }

    public boolean getStockRoseToday() {
        return this.stockRoseToday;
    }
}
