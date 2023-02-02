package com.brideglabz.datastructureandalgorithm.mergesort.mergesortgeneric;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Welcome to Merge Sort Program!\n");
        MergeSortGeneric genericObj = new MergeSortGeneric<>();

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
