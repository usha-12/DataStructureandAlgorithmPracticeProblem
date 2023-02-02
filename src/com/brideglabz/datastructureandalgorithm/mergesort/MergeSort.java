package com.brideglabz.datastructureandalgorithm.mergesort;

import java.util.Scanner;

public class MergeSort {
    public void merge(int array[], int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int leftSubPart[] = new int[leftSize];
        int rightSubPart[] = new int[rightSize];

        for (int index1 = 0; index1 < leftSize; index1++)
            leftSubPart[index1] = array[start + index1];
        for (int index2 = 0; index2 < rightSize; index2++)
            rightSubPart[index2] = array[mid + 1 + index2];

        int leftIndex = 0;
        int rightIndex = 0;
        int mergeIndex = start;
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftSubPart[leftIndex] <= rightSubPart[rightIndex]) {
                array[mergeIndex] = leftSubPart[leftIndex];
                leftIndex++;
            } else {
                array[mergeIndex] = rightSubPart[rightIndex];
                rightIndex++;
            }
            mergeIndex++;
        }

        while (leftIndex < leftSize) {
            array[mergeIndex] = leftSubPart[leftIndex];
            leftIndex++;
            mergeIndex++;
        }

        while (rightIndex < rightSize) {
            array[mergeIndex] = rightSubPart[rightIndex];
            rightIndex++;
            mergeIndex++;
        }
    }

    public void mergeSort(int array[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);

            merge(array, start, mid, end);
        }
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

    public static void main(String[] args) {
        System.out.println("Welcome to Merge Sort Program!\n");

        MergeSort intObj = new MergeSort();
        int array[] = new int[intObj.getSize()];
        intObj.getInput(array, array.length);
        System.out.println("Original Array : ");
        intObj.printArray(array, array.length);
        System.out.println("Merge Sorted Array : ");
        intObj.mergeSort(array, 0, array.length-1);
        intObj.printArray(array, array.length);
    }
}
