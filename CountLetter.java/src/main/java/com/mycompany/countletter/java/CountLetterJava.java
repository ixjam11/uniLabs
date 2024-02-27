package com.mycompany.countletter.java;

import java.util.Scanner;
public class CountLetterJava {

    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("pleas Enter a line of string: ");
        String s = k.nextLine();
        System.out.println("pleas Enter a single letter: ");
        char l = k.next().charAt(0);
        int len = s.length();
        int c = 0;
        for (int i=0; i<len; i++){
            if (s.charAt(i)!=l) continue; c++;
        }            
        System.out.println("Found "+c+" "+l+"\'s in the string.");
    }
}
