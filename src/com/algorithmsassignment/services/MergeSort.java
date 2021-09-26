package com.algorithmsassignment.services;

class MergeSort {

    void splitArray(double array[], int left, int right, boolean isAscending) {
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

    void sortAndMerge(double array[], int left, int mid, int right, boolean isAscending) {

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
        while (i < leftArray.length && j < rightArray.length) {
            if (isAscending) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
            } else {
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

        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}