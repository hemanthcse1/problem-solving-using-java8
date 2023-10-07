package com.hemanth.problemsolving.java8;

import java.util.stream.IntStream;

public class FindPalindromeOfString {

    public static void main(String[] args) {

        String sampleString = "madamm";

        isPalindrome(sampleString);

        if (isPalindrome(sampleString)) {
            System.out.println("Given string \'" + sampleString + "\' " + "is palindrome.");
        } else {
            System.out.println("Given string \'" + sampleString + "\' " + "is not a palindrome.");
        }

    }

    public static boolean isPalindrome(String string) {


        String str = string.replaceAll(" ", "");

        return IntStream.range(0, str.length() / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));

    }

}
