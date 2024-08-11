package com.algorithms;

public class BubbleSort implements SortingTechniques{
    @Override
    public void sort(int[] arr) {
        System.out.println("Using Bubble Sort Technique");
        System.out.println("------------------------------------------");
        int swapCount = 0;
        for (int i=1; i<arr.length; i++) {
            for (int j=0; j<arr.length-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
            //print every step involved in the sorting
            System.out.print("Iteration-"+i+": ");
            SortingTechniques.printArray(arr);
        }
        System.out.println("------------------------------------------");
        System.out.println("Swapping occurred in sorting: "+swapCount);
    }
}
