package com.devxschool;

import java.util.Scanner;

public class CountChars {

    public static void main(String[] args) {
        /**
         * Write a program to count number of vowels, consonants,
         * digits, special characters and whitespaces in the string
         *
         * Ex 1:
         *
         * Enter the string : This program is very easy
         * Vowels: 7
         * Consonants: 14
         * Digits: 0
         * White spaces: 4
         * Symbols : 0
         *
         * Ex 2:
         *
         * Enter the string : 123 this very ^^
         * Vowels: 2
         * Consonants: 6
         * Digits: 3
         * White spaces: 3
         * Symbols : 2
         */

        String line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        line = sc.nextLine();
        printCounts(line);
    }

    public static void printCounts(String word) {
        // TODO IMPLEMENT METHOD
        int vowel = 0;
        int space = 0;
        int digit = 0;
        int symb = 0;
        int conc = 0;
        for (int i = 0; i <= word.length() - 1; i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'y') {
                vowel++;
            } else if (ch == ' ') {
                space++;
            } else if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5'
                    || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == '0') {
                digit++;
            } else if (ch == '&' || ch == '^' || ch == '@' || ch == '$') {
                symb++;
            } else {
                conc++;
            }
        }
        System.out.println("Vowels: " + vowel + "\nConsonants: " + conc +
                "\nDigits: " + digit +
                "\nWhite spaces: " + space
                + "\nSymbols : " + symb);
    }
}
