package com.brideglabz.datastructureandalgorithm.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    static String word1;
    static String word2;

    public static void main(String[] args) {
        System.out.println("\nWelcome to Anagram Detection Program!\n");
        AnagramDetection operation = new AnagramDetection();

        operation.getInput();
        if(operation.checkAnagram())
            System.out.println("\nYes, Anagram!\n'" + word1 + "' and '" + word2 + "' are Anagrams.");
        else
            System.out.println("\nNo, not Anagram!\n'" + word1 + "' and '" + word2 + "' are not Anagrams.");

    }

    public boolean checkAnagram() {
        System.out.println("Checking for Anagram...");
        boolean isAnagram = false;

        char[] firstWord = (word1.toLowerCase().replaceAll("\\s", "")).toCharArray();
        char[] secondWord = (word2.toLowerCase().replaceAll("\\s", "")).toCharArray();
        Arrays.sort(firstWord);;
        Arrays.sort(secondWord);

        if (firstWord.length == secondWord.length)
            isAnagram = Arrays.equals(firstWord, secondWord);
        else
            isAnagram = false;

        return isAnagram;
    }

    public void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string :");
        word1 = scan.nextLine();
        System.out.println("Enter the second string :");
        word2 = scan.nextLine();
        scan.close();
    }
}
