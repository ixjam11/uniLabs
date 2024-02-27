package com.mycompany.countletter.java;

import java.util.Scanner;

public class CountLetterJava {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in); // Create a Scanner object to read input
        
        // Prompt the user to enter a line of string
        System.out.println("Please enter a line of string: ");
        String s = k.nextLine(); // Read the user's input
        
        // Prompt the user to enter a single letter
        System.out.println("Please enter a single letter: ");
        char l = k.next().charAt(0); // Read the user's input letter
        
        int len = s.length(); // Get the length of the string
        int c = 0; // Initialize a counter variable
        
        // Iterate through each character in the string
        for (int i = 0; i < len; i++) {
            // Check if the current character matches the input letter
            if (s.charAt(i) != l) continue; // If not, skip to the next iteration
            c++; // If yes, increment the counter
        }
        
        // Display the count of occurrences of the input letter in the string
        System.out.println("Found " + c + " '" + l + "'s in the string.");
    }
}
