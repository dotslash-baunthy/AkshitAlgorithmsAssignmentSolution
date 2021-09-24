package com.algorithmsassignment.main;
import com.algorithmsassignment.models.Company;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies;
        Company company = new Company();

        System.out.print("Enter the number of companies: ");
        numberOfCompanies = scanner.nextInt();
        for (int i = 0; i < numberOfCompanies; i++) {
            company.companyDetails(i);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("1. Display the companies stock prices in ascending order");
        System.out.println("2. Display the companies stock prices in descending order");
        System.out.println("3. Display the total no. of companies for which stock prices rose today");
        System.out.println("4. Display the total no. of companies for which stock prices declined today");
        System.out.println("5. Search a specific stock price");
        System.out.println("6. Press '0' to exit");
        System.out.println("-----------------------------------------------");
    }
}
