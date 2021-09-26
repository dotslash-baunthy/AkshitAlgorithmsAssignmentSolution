package com.algorithmsassignment.utils;

public class MergeSort {

    // Splits array into two equal halves based on the value of mid
    // isAscending decides whether the sorting is to be done in ascending (true) or
    // descending (false)
    // It's value is used as an argument in the sortAndMerge function and has no
    // real effect in the splitArray function
    public void splitArray(double array[], int left, int right, boolean isAscending) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            splitArray(array, left, mid, isAscending);
            splitArray(array, mid + 1, right, isAscending);

            sortAndMerge(array, left, mid, right, isAscending);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Merges array
    // isAscending decides whether merging is done in ascending (true) or descending
    // (false) order
    private void sortAndMerge(double array[], int left, int mid, int right, boolean isAscending) {

        // Create and populate the left and right arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double leftArray[] = new double[n1];
        double rightArray[] = new double[n2];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;

        int k = left;
        // While elements exist in both the arrays
        while (i < leftArray.length && j < rightArray.length) {
            // Sort in ascending
            if (isAscending) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
            }
            // Sort in descending
            else {
                if (leftArray[i] >= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
            }
            k++;
        }

        // Push all elements of left array into main array
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Push all elements of right array into main array
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}