package com.algorithmsassignment.services;

import java.util.Scanner;

import javax.management.openmbean.OpenDataException;

import com.algorithmsassignment.models.Company;

public class CompanyServices {

    public Company newCompany(int companyNumber) {
        int sharePrice;
        boolean stockRoseToday;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Getting details of company number " + companyNumber + " -");
        System.out.print("Enter the share price: ");
        sharePrice = scanner.nextInt();
        System.out.print("Whether the company's stock price rose today compared to yesterday? ");
        stockRoseToday = scanner.nextBoolean();
        return (new Company(sharePrice, stockRoseToday));
    }

    public void companyOperations(int choice, Company[] companies, double[] sharePrice, boolean[] stockRoseToday) {
        
        if (choice == 0) {
                System.exit(0);
            } else if (choice == 1) {
                stockPricesInAscending(sharePrice);
            } else if (choice == 2) {
                stockPricesInDescending(sharePrice);
            } else if (choice == 3) {
                numberOfCompaniesWithRaisedStock(companies);
            } else if (choice == 4) {
                numberOfCompaniesWithDeclinedStock(companies);
            } else if (choice == 5) {
                searchForSpecificStockPrice();
            } else {
                System.out.println("Use an option between 1 to 5");
            }
    }

    private void stockPricesInAscending(double[] sharePrice) {
        MergeSort mergeSort = new MergeSort();
        double[] sharePriceTemp = sharePrice;
        mergeSort.splitArray(sharePriceTemp, 0, sharePrice.length);
    }

    private int[] stockPricesInDescending(double[] sharePrice) {
        int[] descendingArray = { 0 };
        return descendingArray;
    }

    private void numberOfCompaniesWithRaisedStock(Company[] companies) {
        int stockRoseTodayCounter = 0;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].getStockRoseToday()) {
                stockRoseTodayCounter++;
            }
        }
        if (stockRoseTodayCounter == 1) {
            System.out.println(stockRoseTodayCounter + " company had raised stocks");
        } else {
            System.out.println(stockRoseTodayCounter + " companies had raised stocks");
        }
    }

    private void numberOfCompaniesWithDeclinedStock(Company[] companies) {
        int stockDeclinedTodayCounter = 0;
        for (int i = 0; i < companies.length; i++) {
            if (!companies[i].getStockRoseToday()) {
                stockDeclinedTodayCounter++;
            }
        }
        if (stockDeclinedTodayCounter == 1) {
            System.out.println(stockDeclinedTodayCounter + " company had declined stocks");
        } else {
            System.out.println(stockDeclinedTodayCounter + " companies had declined stocks");
        }
    }

    private int searchForSpecificStockPrice() {
        return 0;
    }
}
