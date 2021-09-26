package com.algorithmsassignment.main;

import com.algorithmsassignment.models.Company;
import com.algorithmsassignment.services.CompanyServices;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies;
        CompanyServices companyServices = new CompanyServices();

        int choice;

        Company[] companies;

        System.out.print("Enter the number of companies: ");
        numberOfCompanies = scanner.nextInt();
        companies = new Company[numberOfCompanies];

        // Create two array the size of number of companies
        // These will store the price of stock and the status of the stock individually
        double[] sharePrice = new double[numberOfCompanies];
        boolean[] stockRoseToday = new boolean[numberOfCompanies];

        for (int i = 0; i < numberOfCompanies; i++) {
            // Call newCompany function which finally calls a parameterized constructor of
            // type Company
            companies[i] = companyServices.newCompany((i + 1));
            sharePrice[i] = companies[i].getSharePrice();
            stockRoseToday[i] = companies[i].getStockRoseToday();
        }

        // Loop over choices menu until choice == 0
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("1. Display the companies stock prices in ascending order");
            System.out.println("2. Display the companies stock prices in descending order");
            System.out.println("3. Display the total no. of companies for which stock prices rose today");
            System.out.println("4. Display the total no. of companies for which stock prices declined today");
            System.out.println("5. Search a specific stock price");
            System.out.println("6. Press '0' to exit");
            System.out.println("-----------------------------------------------");

            choice = scanner.nextInt();

            // For each choice, call the companyOperations function which will determine
            // what action to take
            companyServices.companyOperations(choice, companies, sharePrice, stockRoseToday);

        } while (choice != 0);

    }
}
