package com.brideglabz.datastructureandalgorithm.findyournumber;

import java.util.Scanner;

public class FindNumber {
    Scanner scan = new Scanner(System.in);
    int tries = 0;

    public int getRange() {
        System.out.print("\nEnter a number : ");
        return scan.nextInt();
    }

    public void playWithUser() {
        int range = getRange();
        System.out.println();
        System.out.println("\nNow think of a number between '0' to '" + range + "'");
        discloseChallenge(range);
        findNumber(0, range);
    }

    public void discloseChallenge(int limit) {
        int attempts = (int)(Math.log(limit)/Math.log(2));
        System.out.println("\nComputer will try to guess your number in '" + attempts + "' number of attempts.");
    }

    public boolean checkGuess(int guess) {
        char reply = ' ';
        System.out.println("\nGuessing your number...\n");
        System.out.println("\nIs your number '" + guess + "'?");
        System.out.println("Enter 'YES' or 'NO'.");
        reply = scan.next().toLowerCase().charAt(0);
        tries++;

        if(reply == 'y') {
            System.out.println("\n\nYay!");
            return true;
        }
        else if(reply == 'n') {
            return false;
        }
        else {
            System.out.println("\nInvalid Input!!!\nPlease try again!");
            checkGuess(guess);
        }
        return false;
    }

    public void guessNumber(int low, int mid, int high) {
        System.out.println("\nSelect the applicable choice : ");
        System.out.println("Is your number");
        System.out.println("1. Between " + low + " and " + (mid-1) + " ?");
        System.out.println("2. Between " + (mid+1) + " and " + high + " ?");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("Guessing your number...");
                findNumber(low, (mid-1));
                break;

            case 2 :
                findNumber((mid+1), high);
                break;

            default :
                System.out.println("\nInvalid Choice!!!\nPlease try again!");
                guessNumber(low, mid, high);
                break;
        }

    }

    public void showResult() {
        System.out.println("\nComputer guessed your number correctly in just '" + tries + "' tries.\nThank you for playing.");
    }

    public void findNumber(int low, int high) {
        int mid = (low + high) / 2;

        boolean answer = checkGuess(mid);

        if (!answer) {
            if (low == mid-1)
                answer = checkGuess(low);
            else if(high == mid+1)
                answer = checkGuess(high);
            if (!answer)
                guessNumber(low, mid, high);
        }
        if(answer)
            showResult();
    }
}
