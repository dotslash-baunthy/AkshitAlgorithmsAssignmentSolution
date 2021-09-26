package com.algorithmsassignment.utils;

public class BinarySearch {
    public void binarySearch(double[] stockValues, double searchValue) {

        int left = 0;
        int right = stockValues.length - 1;

        // while left and right arrays have values in them
        while (left <= right) {

            // Find lowest closes integer (mid value) and compare with searchValue
            int mid = (left + right) / 2;

            // If searchValue exists, print and return
            if (searchValue == stockValues[mid]) {
                System.out.println("Stock of value " + searchValue + " is present");
                return;
            }

            // searchValue is smaller than the middle element, meaning that it exists on the
            // left of the search array (since original array is sorted)
            else if (searchValue < stockValues[mid]) {
                right = mid - 1;
            }

            // searchValue is larger than the middle element, meaning that it exists on the
            // right of the search array (since original array is sorted)
            else {
                left = mid + 1;
            }
        }

        // If searchValue does not exist, print
        System.out.println("Stock of value " + searchValue + " is not present");
    }
}
