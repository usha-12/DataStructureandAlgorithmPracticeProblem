package com.brideglabz.datastructureandalgorithm.bubblesort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Welcome to Bubble Sort Program!\n");

        BubbleSort intObj = new BubbleSort();
        int array[] = new int[intObj.getSize()];
        intObj.getInput(array, array.length);
        System.out.println("Original Array : ");
        intObj.printArray(array, array.length);
        System.out.println("Bubble Sorted Array : ");
        intObj.bubbleSort(array, array.length);
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

    public void bubbleSort(int[] elementsArray, int size) {

        for (int counter = 0; counter < (size-1); counter++)
        {
            boolean isSwapped = false;
            for (int index = 0; index < (size - counter - 1); index++)
            {
                if (elementsArray[index] > elementsArray[index+1])
                {
                    int temp = elementsArray[index];
                    elementsArray[index] = elementsArray[index+1];
                    elementsArray[index+1] = temp;
                    isSwapped = true;
                }
            }
            if (!(isSwapped))
                break;
        }
    }

    public void printArray(int[] elementsArray, int size) {
        for (int index = 0; index < size; index++)
        {
            System.out.print(elementsArray[index] + "\s\s");
        }
        System.out.println("\n");
    }
}
