package com.brideglabz.datastructureandalgorithm.primenumber.primepalindrome;

import java.util.ArrayList;

public class PrimeExtension {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Numbers Program!");

        PrimeAnagramPalindrome call = new PrimeAnagramPalindrome();
        ArrayList<Integer> listOfPrimes = new ArrayList<>();

        call.generatePrime(listOfPrimes, 0, 1000);
        ArrayList<Integer> listOfPrimeAnagrams = call.checkForAnagram(listOfPrimes);
        ArrayList<Integer> listOfPrimePalindromes = call.checkForPalindrome(listOfPrimes);
        call.checkForAnagramPalindrome(listOfPrimeAnagrams, listOfPrimePalindromes);
    }
}
