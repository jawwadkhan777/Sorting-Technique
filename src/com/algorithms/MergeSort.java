package com.algorithms;

public class MergeSort {
    public MergeSort() {
        System.out.println("Using Merge Sort Technique");
        System.out.println("------------------------------------------");
    }

    public void sort(int[] arr, int left, int right) {

        if(left<right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, right, mid);
        }
    }

    private void merge(int[] arr, int left, int right, int mid) {
        int leftArraySize = (mid+1)-left; //size of first half array
        int rightArraySize = right-mid; //size of second half array

        int [] leftArray = new int[leftArraySize];
        int [] rightArray = new int[rightArraySize];

        System.out.println("Iteration: ");

        //copying divided array items in newly created arrays(i.e. leftArray and rightArray)
        for (int i=0; i<leftArraySize; i++) {
            leftArray[i] = arr[left+i];
        }
        SortingTechniques.printArray(leftArray);
        for (int i=0; i<rightArraySize; i++) {
            rightArray[i] = arr[(mid+1)+i];
        }
        SortingTechniques.printArray(rightArray);

        int i = 0; //for left array iteration
        int j = 0; //for right array iteration
        int k = left; //for new array indexing

        //this while loop is for merging divided arrays
        while (i<leftArraySize && j<rightArraySize) {
            if(leftArray[i]<=rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //this while loop is for remaining elements in the left sub array
        while(i<leftArraySize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

//        //this while loop is for remaining elements in the right sub array
        while (j<rightArraySize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        SortingTechniques.printArray(arr);
    }
}
