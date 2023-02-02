package com.brideglabz.datastructureandalgorithm.binarysearchworld;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BinarySearchParagraph {
    String[] wordList;

    public void displyResult(String find) {
        if((search(find)))
            System.out.println("\nFound '" + find + "' in the given list of words!");
        else
            System.out.println("\nFound no matches for '" + find + "' in the given list of words!");
    }

    public String binarySearch(int low, int high, String find) {
        int mid = (low + high)/2;
        if (wordList[mid].equals(find))
            return find;

        while (low <= high) {
            if (wordList[mid].compareTo(find) > 0)
                return binarySearch(low, mid-1, find);
            else if (wordList[mid].compareTo(find) < 0)
                return binarySearch((mid + 1), high, find);
        }
        return null;
    }

    public boolean search(String lookFor) {
        return (lookFor.equals(binarySearch(0, wordList.length-1, lookFor)) ? true : false);
    }

    public String getSearchWord() {
        System.out.print("\nEnter a word to check if it exists in the given list of words : ");
        Scanner sc = new Scanner(System.in);
        String searchFor = sc.next();
        System.out.println();
        sc.close();

        return searchFor.toLowerCase().trim();
    }

    public void sortWordList() {
        Arrays.sort(wordList);
    }

    public void removeDuplicates() {
        HashSet<String> mySet = new HashSet<String>(Arrays.asList(wordList));
        wordList = new String[mySet.size()];
        mySet.toArray(wordList);
    }

    public void printWordList() {
        System.out.println("\n\nPrinting the list of words : \n");
        for (String word : wordList)
            System.out.println(word);
    }

    public void printParagraph() {
        System.out.println("\n\nParagraph :");
        String paragraph = "Betty bought a bit of butter\n"
                + "But the butter Betty bought was bitter\n"
                + "So Betty bought a better butter\n"
                + "And it was better than the butter Betty bought before";
        System.out.println(paragraph);
    }

    public void getInputList() {
        String paragraph = "Betty bought a bit of butter\n"
                + "But the butter Betty bought was bitter\n"
                + "So Betty bought a better butter\n"
                + "And it was better than the butter Betty bought before";
        wordList = paragraph.toLowerCase().split(" ");
    }
}
