package com.mycompany.computebmi;

import java.util.Scanner;

public class ComputeBMI {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in); // Create a Scanner object to read input
        
        // Prompt the user to enter their weight in pounds
        System.out.println("Enter your weight in pounds: ");
        double w = k.nextDouble(); // Read the user's weight
        
        // Prompt the user to enter their height in inches
        System.out.println("Enter your height in inches: ");
        double h = k.nextDouble(); // Read the user's height
        
        // Calculate the BMI using the provided formula
        double bmi = (w * 0.45359237) / ((h * 0.0254) * (h * 0.0254));
        
        // Display the calculated BMI
        System.out.println("Your BMI is: " + bmi);
        
        // Determine the BMI category and display an appropriate message
        if (bmi < 16) {
            System.out.println("You are seriously underweight");
        } else if (bmi < 18) {
            System.out.println("You are underweight");
        } else if (bmi < 24) {
            System.out.println("You are normal weight");
        } else if (bmi < 29) {
            System.out.println("You are overweight");
        } else if (bmi < 35) {
            System.out.println("You are seriously overweight");
        } else {
            System.out.println("You are gravely overweight");
        }
    }
}
