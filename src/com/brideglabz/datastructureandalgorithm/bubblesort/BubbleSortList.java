package com.brideglabz.datastructureandalgorithm.bubblesort;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortList {
    public static void main(String[] args) {
        System.out.println("Welcome to Bubble Sort Program!\n");

        BubbleSortList listObj = new BubbleSortList();
        ArrayList<Integer> list = new ArrayList<>();
        listObj.getInput(list, listObj.getSize());
        System.out.println("Original Input : ");
        listObj.printArray(list);
        System.out.println("After Bubble Sorted : ");
        listObj.bubbleSort(list);
        listObj.printArray(list);
    }

    public void getInput(ArrayList<Integer> list, int numberOfElements) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the elements to be sorted : ");
        for (int counter = 0; counter < numberOfElements; counter++)
            list.add(scan.nextInt());
        scan.close();
    }

    public int getSize() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the number of elements to be sorted : ");
        int numberOfElements = scan.nextInt();

        return numberOfElements;
    }

    public void bubbleSort(ArrayList<Integer> list) {

        boolean isSwapped = false;

        for (int counter = 0; counter < (list.size() - 1); counter++) {
            for (int index = 0; index < (list.size() - counter - 1); index++) {
                if (list.get(index).compareTo(list.get(index+1)) > 0)
                {
                    Integer temp = list.get(index);
                    list.set(index, list.get(index+1));
                    list.set((index+1), temp);
                    isSwapped = true;
                }
            }
        }
    }

    public void printArray(ArrayList<Integer> list) {
        for (Integer element : list)
        {
            System.out.print(element + "\s\s");
        }
        System.out.println("\n");
    }
}
