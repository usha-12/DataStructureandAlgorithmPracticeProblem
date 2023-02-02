package com.brideglabz.datastructureandalgorithm.primenumber.primepalindrome;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagramPalindrome {
    public ArrayList<Integer> checkForAnagram(ArrayList<Integer> primes) {
        ArrayList<Integer> anagrams = new ArrayList<>();

        for (int index = 0; index < primes.size(); index++) {
            char[] base = String.valueOf(primes.get(index)).toCharArray();
            if(isAnagram(base, primes))
                anagrams.add(primes.get(index));
        }
        System.out.println("\nDisplaying Prime Numbers that are also Anagrams : ");
        printList(anagrams);

        return anagrams;
    }

    public boolean isAnagram(char[] original, ArrayList<Integer> primes) {
        Arrays.sort(original);

        for (Integer prime : primes) {
            char[] toCompare = String.valueOf(prime).toCharArray();
            Arrays.sort(toCompare);
            if (Arrays.equals(original, toCompare))
                return true;
        }

        return false;
    }

    public ArrayList<Integer> checkForPalindrome(ArrayList<Integer> primes) {
        ArrayList<Integer> palindromes = new ArrayList<>();

        for (int index = 0; index < primes.size(); index++) {
            String original = String.valueOf(primes.get(index));
            StringBuilder reverse = new StringBuilder(original).reverse();
            if (original.equals((reverse).toString()))
                palindromes.add(primes.get(index));
        }
        System.out.println("\nDisplaying Prime Numbers that are also Palindromes : ");
        printList(palindromes);

        return palindromes;
    }

    public void checkForAnagramPalindrome(ArrayList<Integer> anagrams, ArrayList<Integer> palindromes) {
        ArrayList<Integer> anagramPalindrome = new ArrayList<>();

        for (int counter = 0; counter < anagrams.size(); counter++)
            if (palindromes.contains(anagrams.get(counter)))
                anagramPalindrome.add(anagrams.get(counter));

        System.out.println("\nDisplaying Prime Numbers that are Anagrams as well as Palindromes : ");
        printList(anagramPalindrome);
    }

    public void generatePrime(ArrayList<Integer> primes, int low, int high) {
        for (int counter = 2; counter <= high; counter++) {
            int flag = 0;
            for (int factor = 2; factor < counter; factor++) {
                if(counter % factor == 0)
                    flag++;
            }
            if (flag == 0)
                primes.add(counter);
        }
        System.out.println("\nGenerating Prime numbers between 0 and 1000:\n");
        printList(primes);
    }

    public void printList(ArrayList<Integer> list) {
        for (Integer element : list)
            System.out.println(element);
        System.out.println();
    }
}
