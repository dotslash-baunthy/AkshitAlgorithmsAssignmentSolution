package com.algorithmsassignment.models;

import java.util.Scanner;

import com.algorithmsassignment.services.CompanyServices;

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

    public void companyOperations(int operationNumber) {
        CompanyServices companyServices = new CompanyServices();
        // switch (operationNumber) {
        // case 1:
        // stockPricesInAscending();
        // case 2:
        // stockPricesInDescending();
        // case 3:
        // numberOfCompaniesWithRaisedStock();
        // case 4:
        // numberOfCompaniesWithDeclinedStock();
        // case 5:
        // searchForSpecificStockPrice();
        // case 0:
        // System.out.println("Exiting!");
        // System.exit(0);
        // default:
        // System.out.println("Use an option between 1 to 5");
        // }

        while (operationNumber != 0) {
            if (operationNumber == 1) {
                companyServices.stockPricesInAscending();
            } else if (operationNumber == 2) {
                companyServices.stockPricesInDescending();
            } else if (operationNumber == 3) {
                companyServices.numberOfCompaniesWithRaisedStock();
            } else if (operationNumber == 4) {
                companyServices.numberOfCompaniesWithDeclinedStock();
            } else if (operationNumber == 5) {
                companyServices.searchForSpecificStockPrice();
            } else {
                System.out.println("Use an option between 1 to 5");
            }
        }
        if (operationNumber == 0) {
            System.out.println("Exiting!");
            System.exit(0);
        }
    }
}
