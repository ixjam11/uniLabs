package com.mycompany.computebmi;

import java.util.Scanner;
public class ComputeBMI {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double w=k.nextDouble();
        System.out.println("Enter your height in inches: ");
        double h=k.nextDouble();
        double bmi=(w*0.45359237)/((h*0.0254)*(h*0.0254));
        System.out.println("your BMI is: "+bmi);
        if (bmi<16){
            System.out.println("you are serious underweight");}
        else if (bmi<18){
            System.out.println("you are underweight");}
        else if(bmi<24){
            System.out.println("you are normal weight");}
        else if(bmi<29){
           System.out.println("you are overweight");} 
        else if(bmi<35){
            System.out.println("you are seriously overweight");}
        else{
            System.out.println("you are gravely overweight");}
        }
    }

