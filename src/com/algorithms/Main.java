package com.algorithms;

public class Main {
    public static void main(String[] args) {
        int [] array = {6,5,2,8,9,4,12};
        System.out.print("Unsorted Array: ");
        SortingTechniques.printArray(array);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);


//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort(array);

//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.sort(array);

//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(array, 0, array.length-1);

//        MergeSort mergeSort = new MergeSort();
//        mergeSort.sort(array, 0, array.length-1);

        System.out.print("Sorted Array: ");
        SortingTechniques.printArray(array);
        System.out.println("__________________________________________");
    }
}