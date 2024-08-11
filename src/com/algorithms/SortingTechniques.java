package com.algorithms;

public interface SortingTechniques {
    void sort(int[] arr);//creating sort signature for future use

    static void printArray(int[] arr) {
        for (int value: arr) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
