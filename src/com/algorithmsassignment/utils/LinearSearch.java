package com.algorithmsassignment.utils;

// Simple linear search
// Only print if stock value exists or not
public class LinearSearch {
    public void search(double[] sharePrice, double searchValue) {
        for (int i = 0; i < sharePrice.length; i++) {
            if (sharePrice[i] == searchValue) {
                System.out.println("Stock of value " + searchValue + " is present");
                return;
            } else {
                // DO NOTHING
            }
        }
        System.out.println("Stock of value " + searchValue + " is not present");
    }
}
