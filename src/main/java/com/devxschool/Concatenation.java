package com.devxschool;

//import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Concatenation {

    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the character's
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */

        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str = sc.nextLine();
        System.out.print("Enter second word: ");
        String str1 = sc.nextLine();
        System.out.println(concat(str, str1));

    }

    public static String concat(String word1, String word2) {
        // TODO IMPLEMENT METHOD
        char lastChar = word1.charAt(word1.length()-1);
        char firstChar = word2.charAt(0);
        if (lastChar == firstChar){
            word1 = word1.concat(word2.substring(1));
        }else {
            word1 = word1.concat(word2);
        }
        return word1;
    }
}
