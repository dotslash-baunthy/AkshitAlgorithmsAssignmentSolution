package com.algorithmsassignment.services;

public class CompanyServices {

    public void companyOperations(int operationNumber) {

        switch(operationNumber) {
            case 0:
                return;
            case 1:
            stockPricesInAscending();
            case 2:
                stockPricesInDescending();
            case 3:
                numberOfCompaniesWithRaisedStock();
            case 4:
                numberOfCompaniesWithDeclinedStock();
            case 5:
                searchForSpecificStockPrice();
            default:
                System.out.println("Use an option between 1 to 5");
        }
    }

    private int[] stockPricesInAscending() {
        int[] ascendingArray = { 0 };
        return ascendingArray;
    }

    private int[] stockPricesInDescending() {
        int[] descendingArray = { 0 };
        return descendingArray;
    }

    private int numberOfCompaniesWithRaisedStock() {
        return 1;
    }

    private int numberOfCompaniesWithDeclinedStock() {
        return -1;
    }

    private int searchForSpecificStockPrice() {
        return 0;
    }
}
