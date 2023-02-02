package com.brideglabz.datastructureandalgorithm.mergesort.mergesortgeneric;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortGeneric<E extends Comparable<E>> {
        Scanner scan = new Scanner(System.in);

        public <E extends Comparable<E>> void merge(ArrayList<E> list, int start, int mid, int end) {
            int leftSize = mid - start + 1;
            int rightSize = end - mid;

            ArrayList<E> leftSubPart = new ArrayList();;
            ArrayList<E> rightSubPart = new ArrayList();;

            for (int index1 = 0; index1 < leftSize; index1++)
                leftSubPart.add(list.get(start + index1));
            for (int index2 = 0; index2 < rightSize; index2++)
                rightSubPart.add(list.get(mid + 1 + index2));

            int leftIndex = 0;
            int rightIndex = 0;
            int mergeIndex = start;
            while (leftIndex < leftSize && rightIndex < rightSize) {
                if(leftSubPart.get(leftIndex).compareTo(rightSubPart.get(rightIndex)) <= 0) {
                    list.set(mergeIndex, leftSubPart.get(leftIndex));
                    leftIndex++;
                }
                else {
                    list.set(mergeIndex, rightSubPart.get(rightIndex));
                    rightIndex++;
                }
                mergeIndex++;
            }

            while (leftIndex < leftSize) {
                list.set(mergeIndex, leftSubPart.get(leftIndex));
                leftIndex++;
                mergeIndex++;
            }

            while(rightIndex < rightSize) {
                list.set(mergeIndex, rightSubPart.get(rightIndex));
                rightIndex++;
                mergeIndex++;
            }
        }

        public <E extends Comparable<E>> void mergeSort(ArrayList<E> list, int start, int end) {
            if (start < end) {
                int mid = (start + end) / 2;

                mergeSort(list, start, mid);
                mergeSort(list, mid + 1, end);

                merge(list, start, mid, end);
            }
        }

        public void sortInt(ArrayList<Integer> list) {
            System.out.println("Sorting Integers\n");
            int numberOfElements = getSize();

            getInputInt(list, numberOfElements);
            System.out.println("Original Input : ");
            printList(list);
            System.out.println("After Merge Sort : ");
            mergeSort(list, 0, list.size()-1);
            printList(list);
        }

        public void sortDouble(ArrayList<Double> list) {
            System.out.println("Sorting Doubles\n");
            int numberOfElements = getSize();

            getInputDouble(list, numberOfElements);
            System.out.println("Original Input : ");
            printList(list);
            System.out.println("After Merge Sort : ");
            mergeSort(list, 0, list.size()-1);
            printList(list);
        }

        public void sortFloat(ArrayList<Float> list) {
            System.out.println("Sorting Floats\n");
            int numberOfElements = getSize();

            getInputFloat(list, numberOfElements);
            System.out.println("Original Input : ");
            printList(list);
            System.out.println("After Merge Sort : ");
            mergeSort(list, 0, list.size()-1);
            printList(list);
        }

        public void sortString(ArrayList<String> list) {
            System.out.println("Sorting Strings\n");
            int numberOfElements = getSize();

            getInputString(list, numberOfElements);
            System.out.println("Original Input : ");
            printList(list);
            System.out.println("After Merge Sort : ");
            mergeSort(list, 0, list.size()-1);
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
            for (E element : list)
            {
                System.out.print(element + "\s\s");
            }
            System.out.println("\n");
        }
}
