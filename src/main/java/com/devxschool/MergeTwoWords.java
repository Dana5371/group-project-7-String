package com.devxschool;

public class MergeTwoWords {

    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:return null;
         * isceea
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */

        String word1 = "ice";
        String word2 = "sea";
        System.out.println("Merging words: " + word1 + ", " + word2);
        printMerge(word1, word2);
    }

    public static void printMerge(String word1, String word2) {
        //TODO IMPLEMENT METHOD
        String str = "";
        for (int i = 0, k = 0; i <= word1.length() - 1 && k <= word2.length() - 1; i++, k++) {
            str += word1.charAt(i);
            str += word2.charAt(k);
        }
        System.out.println(str);
    }
}
