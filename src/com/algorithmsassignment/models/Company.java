package com.algorithmsassignment.models;

import java.util.Scanner;

public class Company {
    double sharePrice;
    boolean stockRoseToday;
    Scanner scanner = new Scanner(System.in);

    public void companyDetails(int companyNumber) {
        System.out.print("Enter the current stock price of company " + companyNumber);
        sharePrice = scanner.nextDouble();
        System.out.print("Whether the company's stock price rose today compared to yesterday? ");
        stockRoseToday = scanner.nextBoolean();
    }
}
