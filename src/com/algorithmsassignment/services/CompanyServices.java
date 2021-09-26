package com.algorithmsassignment.services;

import java.util.Scanner;

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
            stockPricesSort(sharePrice, true);
        } else if (choice == 2) {
            stockPricesSort(sharePrice, false);
        } else if (choice == 3) {
            numberOfCompaniesWithSameStockStatus(companies, true);
        } else if (choice == 4) {
            numberOfCompaniesWithSameStockStatus(companies, false);
        } else if (choice == 5) {
            searchForSpecificStockPrice();
        } else {
            System.out.println("Use an option between 1 to 5");
        }
    }

    private void stockPricesSort(double[] sharePrice, boolean isAscending) {
        MergeSort mergeSort = new MergeSort();
        double[] sharePriceTemp = sharePrice;
        mergeSort.splitArray(sharePriceTemp, 0, sharePriceTemp.length - 1, isAscending);
    }

    private void numberOfCompaniesWithSameStockStatus(Company[] companies, boolean isRaised) {
        int counter = 0;
        for (int i = 0; i < companies.length; i++) {
            if (isRaised) {
                if (companies[i].getStockRoseToday()) {
                    counter++;
                }
            } else {
                if (!companies[i].getStockRoseToday()) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    private int searchForSpecificStockPrice() {
        return 0;
    }
}
