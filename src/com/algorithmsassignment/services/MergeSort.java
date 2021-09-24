package com.algorithmsassignment.services;

public class MergeSort {
    public void splitArray(int[] array, int leftElement, int rightElement) {

        if (leftElement < rightElement) {
            int midElement = (leftElement + rightElement) / 2;
            splitArray(array, leftElement, midElement);
            splitArray(array, midElement + 1, rightElement);
            sortAndMergeArray(array, leftElement, midElement, rightElement);
        }

    }

    public void sortAndMergeArray(int[] array, int leftElement, int midElement, int rightElement) {

        int n1 = midElement - leftElement + 1; // size of left array
        int[] leftArray = new int[n1];
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[leftElement + i];
        }

        int n2 = rightElement - midElement; // size of right array
        int[] rightArray = new int[n2];
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = array[midElement + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = leftElement;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
