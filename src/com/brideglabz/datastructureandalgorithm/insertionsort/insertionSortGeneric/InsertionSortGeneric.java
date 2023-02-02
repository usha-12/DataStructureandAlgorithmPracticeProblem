package com.brideglabz.datastructureandalgorithm.insertionsort.insertionSortGeneric;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSortGeneric<E extends Comparable<E>> {
    Scanner scan = new Scanner(System.in);

    public void sortInt(ArrayList<Integer> list) {
        System.out.println("Sorting Integers\n");
        int numberOfElements = getSize();

        getInputInt(list, numberOfElements);
        System.out.println("Original Input : ");
        printList(list);
        System.out.println("After Insertion Sort : ");
        insertionSort(list);
        printList(list);
    }

    public void sortDouble(ArrayList<Double> list) {
        System.out.println("Sorting Doubles\n");
        int numberOfElements = getSize();

        getInputDouble(list, numberOfElements);
        System.out.println("Original Input : ");
        printList(list);
        System.out.println("After Insertion Sort : ");
        insertionSort(list);
        printList(list);
    }

    public void sortFloat(ArrayList<Float> list) {
        System.out.println("Sorting Floats\n");
        int numberOfElements = getSize();

        getInputFloat(list, numberOfElements);
        System.out.println("Original Input : ");
        printList(list);
        System.out.println("After Insertion Sort : ");
        insertionSort(list);
        printList(list);
    }

    public void sortString(ArrayList<String> list) {
        System.out.println("Sorting Strings\n");
        int numberOfElements = getSize();

        getInputString(list, numberOfElements);
        System.out.println("Original Input : ");
        printList(list);
        System.out.println("After Insertion Sort : ");
        insertionSort(list);
        printList(list);
    }

    public void getInputInt(ArrayList<Integer> list, int numberOfElements) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the integer elements to be sorted : ");
        for (int counter = 0; counter < numberOfElements; counter++)
            list.add(scan.nextInt());
    }

    public void getInputDouble(ArrayList<Double> list, int numberOfElements) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the double elements to be sorted : ");
        for (int counter = 0; counter < numberOfElements; counter++)
            list.add(scan.nextDouble());
    }

    public void getInputFloat(ArrayList<Float> list, int numberOfElements) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the float elements to be sorted : ");
        for (int counter = 0; counter < numberOfElements; counter++)
            list.add(scan.nextFloat());
    }

    public void getInputString(ArrayList<String> list, int numberOfElements) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the string elements to be sorted : ");
        for (int counter = 0; counter < numberOfElements; counter++)
            list.add(scan.nextLine());
    }

    public int getSize() {
        System.out.print("\nEnter the number of elements to be sorted : ");
        int numberOfElements = scan.nextInt();

        return numberOfElements;
    }

    public <E> void printList(ArrayList<E> list) {
        for (E element : list) {
            System.out.print(element + "\s\s");
        }
        System.out.println("\n");
    }

    public <E extends Comparable<E>> void insertionSort(ArrayList<E> list) {
        for (int counter = 0; counter < list.size(); counter++) {
            E key = list.get(counter);
            int index = counter - 1;

            while (index >= 0 && list.get(index).compareTo(key) > 0) {
                list.set(index + 1, list.get(index));
                index--;
            }
            list.set(index + 1, key);
        }
    }
}
