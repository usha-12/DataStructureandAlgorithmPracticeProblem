package com.brideglabz.datastructureandalgorithm.stringpermutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringPermutationMethods {
    private static ArrayList<String> recursive = new ArrayList<>();
    private static ArrayList<String> iterative = new ArrayList<>();

    public static void permutateRecursive(String input, String permute)
    {
        if (input.length() == 0) {
            recursive.add(permute);
            return;
        }

        for (int index = 0; index < input.length(); index++) {
            char freeze = input.charAt(index);
            String toAppend = input.substring(0, index) + input.substring(index + 1);
            permutateRecursive(toAppend, permute + freeze);
        }
    }

    private static void swap(char[] array, int swap, int toSwap)
    {
        char tempChar = array[swap];
        array[swap] = array[toSwap];
        array[toSwap] = tempChar;
    }

    private static void reverse(char[] charArray, int startIndex, int endIndex)
    {
        while (startIndex < endIndex) {
            swap(charArray, startIndex++, endIndex--);
        }
    }

    public static void PermutationIterative(String input)
    {
        char[] original = input.toCharArray();
        Arrays.sort(original);

        int size = input.length();
        while (true)
        {
            iterative.add(String.valueOf(original));

            int currentIndex = size - 1;
            while (original[currentIndex-1] >= original[currentIndex])
            {
                if (--currentIndex == 0) {
                    return;
                }
            }

            int reverseIndex = size - 1;
            while (reverseIndex > currentIndex && original[reverseIndex] <= original[currentIndex-1]) {
                reverseIndex--;
            }

            swap(original, currentIndex - 1, reverseIndex);
            reverse (original, currentIndex, size - 1);
        }
    }

    public boolean checkIfEqualResults() {
        Collections.sort(recursive);
        Collections.sort(iterative);

        return (recursive.equals(iterative));
    }

    public void displayResult() {
        System.out.println("\nPermutation results by Recursions : \n");
        for(String element : recursive)
            System.out.println(element);
        System.out.println("\nPermutation results by Iterations : \n");
        for(String element : iterative)
            System.out.println(element);
        if(checkIfEqualResults())
            System.out.println("\nYes, Recursion and Iteration, both produce the same results!");
        else
            System.out.println("\nNo, Recursion and Iteration, do not produce the same results!");
    }

    public String getInput() {
        System.out.println("\nEnter a string : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        return input;
    }
}
