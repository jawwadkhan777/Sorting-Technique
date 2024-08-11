package com.algorithms;

public class InsertionSort implements SortingTechniques{

    public void sort (int[] arr) {
        System.out.println("Using Insertion Sort Technique");
        System.out.println("------------------------------------------");
        int shiftCount = 0;
        for (int i=1; i<arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && key<arr[j]) {
                arr[j+1] = arr[j];
                shiftCount++;
                j--;
            }
            if (j<i-1) {
                arr[j + 1] = key;
                shiftCount++;
            }
            //print every step involved in the sorting
            System.out.print("Iteration-"+i+": ");
            SortingTechniques.printArray(arr);
        }
        System.out.println("------------------------------------------");
        System.out.println("Shifting occurred in sorting: "+shiftCount);
    }
}
