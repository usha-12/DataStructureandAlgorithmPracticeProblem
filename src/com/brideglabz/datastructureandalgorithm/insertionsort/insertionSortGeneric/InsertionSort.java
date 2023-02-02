package com.brideglabz.datastructureandalgorithm.insertionsort.insertionSortGeneric;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Welcome to Insertion Sort Program!\n");
        InsertionSortGeneric genericObj = new InsertionSortGeneric<>();

        ArrayList<Integer> intList = new ArrayList();
        genericObj.sortInt(intList);

        ArrayList<Double> doubleList = new ArrayList();
        genericObj.sortDouble(doubleList);

        ArrayList<Integer> floatList = new ArrayList();
        genericObj.sortFloat(floatList);

        ArrayList<Integer> stringList = new ArrayList();
        genericObj.sortString(stringList);
    }
}
