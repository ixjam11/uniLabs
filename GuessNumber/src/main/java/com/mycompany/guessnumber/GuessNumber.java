package com.mycompany.guessnumber;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in); // Create a Scanner object to read input
        int r = (int) (Math.random() * 101); // Generate a random number between 0 and 100
        System.out.println("Guess a magic number between 0 and 100: "); // Prompt the user to guess
        int n = k.nextInt(); // Read the user's guess
        while (n != r) { // Loop until the user's guess matches the random number
            System.out.println("Enter your guess: "); // Prompt the user for another guess
            n = k.nextInt(); // Read the user's next guess
            if (n == r) { // If the guess is correct
                System.out.println("Yes, the number is " + n); // Print a success message
            } else if (n > r) { // If the guess is too high
                System.out.println("Your guess is too high"); // Print a message indicating the guess is too high
            } else { // If the guess is too low
                System.out.println("Your guess is too low"); // Print a message indicating the guess is too low
            }
        }
    }
}
