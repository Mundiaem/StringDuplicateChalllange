package com.java.duplicates;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.printf(" returned String: %s\n", removeDuplicate("abbaca"));
    }

    public static String removeDuplicate(String s) {
        boolean contains;
        char[] sCharArray = s.toCharArray();
        char currentChar;
        for (int i = 0; i < sCharArray.length; i++) {
            currentChar = sCharArray[i];
            String currentLetter = String.valueOf(currentChar);
            contains = s.contains(currentLetter + currentLetter);
//            System.out.println(contains);
            if (contains) {
                s = removeDuplicate(s.replace(currentLetter + currentLetter, ""));;
//                System.out.println("After replacing " + s);
            }

        }

        return s;
    }


}
