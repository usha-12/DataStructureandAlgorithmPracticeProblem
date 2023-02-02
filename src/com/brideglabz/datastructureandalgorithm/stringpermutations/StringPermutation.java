package com.brideglabz.datastructureandalgorithm.stringpermutations;

public class StringPermutation {
    public static void main(String[] args)
    {
        System.out.println("Welcome to String Permutations program : ");
        StringPermutationMethods call = new StringPermutationMethods();
        String input = call.getInput();
        StringPermutationMethods.permutateRecursive(input, "");
        StringPermutationMethods.PermutationIterative(input);
        call.displayResult();
    }
}
