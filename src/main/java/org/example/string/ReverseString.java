package org.example.string;

/**
 * Problem: Reverse a String
 * Description: Reverses a given string using character traversal.
 * Author: Your Name
 * Date: 2025-05-01
 */

public class ReverseString {

    /**
     * Reverses the input string.
     *
     * @param str the string to reverse
     * @return the reversed string
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // You can also use StringBuilder for better performance
        }

        return reversed;
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverse(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);
    }
}

/*
 * Potential Improvements:
 * - Use StringBuilder or StringBuffer for O(1) append performance
 * - Add null/empty string checks
 */
