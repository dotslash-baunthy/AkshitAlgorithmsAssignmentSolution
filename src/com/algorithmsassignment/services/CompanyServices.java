package com.algorithmsassignment.services;

import java.util.Scanner;

import com.algorithmsassignment.models.Company;
import com.algorithmsassignment.utils.LinearSearch;
import com.algorithmsassignment.utils.MergeSort;

public class CompanyServices {

    // Adding new company into Company array
    public Company newCompany(int companyNumber) {
        double sharePrice;
        boolean stockRoseToday;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Getting details of company number " + companyNumber + " -");
        System.out.print("Enter the share price: ");
        sharePrice = scanner.nextDouble();
        System.out.print("Whether the company's stock price rose today compared to yesterday? ");
        stockRoseToday = scanner.nextBoolean();
        // Return parameterized constructor which is creating a new Company object with
        // given values
        return (new Company(sharePrice, stockRoseToday));
    }

    // Main calls this function, choice determines what task is to be done
    public void companyOperations(int choice, Company[] companies, double[] sharePrice, boolean[] stockRoseToday) {

        switch (choice) {
            case 0:
                System.exit(0);
            case 1:
                stockPricesSort(sharePrice, true);
                break;
            case 2:
                stockPricesSort(sharePrice, false);
                break;
            case 3:
                numberOfCompaniesWithSameStockStatus(companies, true);
                break;
            case 4:
                numberOfCompaniesWithSameStockStatus(companies, false);
                break;
            case 5:
                searchForSpecificStockPrice(sharePrice);
                break;
            default:
                System.out.println("Use an option between 1 to 5");
                // Broken because there is a loop in Driver which will switch(choice) again
                break;
        }
    }

    // Sort sharePrices array
    // isAscending determines whether in ascending (if isAscending is false) or
    // descending (if isAscending is false)
    private void stockPricesSort(double[] sharePrice, boolean isAscending) {
        MergeSort mergeSort = new MergeSort();
        // New array created so that the actual array isn't messed up
        // This was created in case we wanted to preserve the indexes (this is not used
        // but code exists in case an update is to be made)
        double[] sharePriceTemp = sharePrice;
        mergeSort.splitArray(sharePriceTemp, 0, sharePriceTemp.length - 1, isAscending);
    }

    // Print how many companies had higher stock value compared to yesterday (if
    // isRaised is true) or lower stock value (if isRaised is false)
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

    // Search for specific stock value
    // This calls a linearSearch function
    private void searchForSpecificStockPrice(double[] sharePrice) {
        LinearSearch linearSearch = new LinearSearch();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key value: ");
        double searchValue = scanner.nextDouble();
        linearSearch.search(sharePrice, searchValue);
    }
}
