package com.algorithms;

public class SelectionSort implements SortingTechniques{

    @Override
    public void sort(int[] arr) {
        System.out.println("Using Selection Sort Technique");
        System.out.println("------------------------------------------");
        int minIndex = -1;
        int swapCount = 0;

        for (int i=0; i < arr.length-1; i++) {
            minIndex = i;
            for (int j=i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex!=i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                swapCount++;
            }
            //print every step involved in the sorting
            System.out.print("Iteration-"+(i+1)+": ");
            SortingTechniques.printArray(arr);
        }
        System.out.println("------------------------------------------");
        System.out.println("Swapping occurred in sorting: "+swapCount);
    }
}
