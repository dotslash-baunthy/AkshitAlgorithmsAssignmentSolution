package com.algorithmsassignment.utils;

public class BinarySearch {
    // Function to determine if a `target` exists in the sorted array `nums`
    // or not using a binary search algorithm
    public void binarySearch(double[] stockValues, double searchValue) {
        // search space is nums[left…right]
        int left = 0;
        int right = stockValues.length - 1;

        // loop till the search space is exhausted
        while (left <= right) {
            // find the mid-value in the search space and
            // compares it with the target

            int mid = (left + right) / 2;

            // overflow can happen. Use:
            // int mid = left + (right - left) / 2;
            // int mid = right - (right - left) / 2;

            // target is found
            if (searchValue == stockValues[mid]) {
                System.out.println("Stock of value " + searchValue + " is present");
                return;
            }

            // discard all elements in the right search space,
            // including the middle element
            else if (searchValue < stockValues[mid]) {
                right = mid - 1;
            }

            // discard all elements in the left search space,
            // including the middle element
            else {
                left = mid + 1;
            }
        }

        // `target` doesn't exist in the array
        System.out.println("Stock of value " + searchValue + " is not present");
    }
}
