package com.brideglabz.datastructureandalgorithm.insertionsort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Welcome to Insertion Sort Program!\n");

        InsertionSort intObj = new InsertionSort();
        int array[] = new int[intObj.getSize()];
        intObj.getInput(array, array.length);
        System.out.println("Original Array : ");
        intObj.printArray(array, array.length);
        System.out.println("Insertion Sorted Array : ");
        intObj.insertionSort(array, array.length);
        intObj.printArray(array, array.length);
    }

    public void getInput(int[] inputArray, int numberOfElements) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the elements to be sorted : ");
        for (int index = 0; index < numberOfElements; index++)
        {
            inputArray[index] = scan.nextInt();
        }
        scan.close();
    }

    public int getSize() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number of elements to be sorted : ");
        int numberOfElements = scan.nextInt();

        return numberOfElements;
    }

    public void printArray(int[] elementsArray, int size) {
        for (int index = 0; index < size; index++)
        {
            System.out.print(elementsArray[index] + "\s\s");
        }
        System.out.println("\n");
    }

    public void insertionSort(int[] unsortedArray, int size) {
        for (int counter = 0; counter < size; counter++) {
            int key = unsortedArray[counter];
            int index = counter - 1;

            while(index >= 0 && unsortedArray[index] > key) {
                unsortedArray[index+1] = unsortedArray[index];
                index--;
            }
            unsortedArray[index+1] = key;
            printArray(unsortedArray, size);

        }
    }
}
