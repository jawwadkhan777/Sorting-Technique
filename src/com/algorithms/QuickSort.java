package com.algorithms;

public class QuickSort{

    public QuickSort() {
        System.out.println("Using Quick Sort Technique");
        System.out.println("------------------------------------------");
    }

    public void sort(int[] arr, int low, int high) {
        if (low<high) {
            int pivotIndex = partition(arr, low, high);

            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivotValue = arr[high];
        int i = low-1;


        //print every step involved in the sorting
        System.out.println("Iteration: ");
        for (int j=low; j<high; j++) {
            if (arr[j]<pivotValue) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                System.out.print("After replacing ith and jth value, if condition is true: ");
                SortingTechniques.printArray(arr);
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        System.out.print("After replacing pivot value at the right position: ");
        SortingTechniques.printArray(arr);

        return i+1;
    }
}
