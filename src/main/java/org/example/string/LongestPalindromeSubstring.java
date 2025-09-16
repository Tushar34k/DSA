package org.example.string;

/**
 * Problem: Longest Palindromic Substring
 * Author: Tushar Kokane
 * Date: 2025-09-16
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class LongestPalindromeSubstring {

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand around center i for odd and even length palindromes
            int len1 = expandAroundCenter(s, i, i);     // Odd length
            int len2 = expandAroundCenter(s, i, i + 1); // Even length
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Helper function to expand around the center
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Main function to test the solution
    public static void main(String[] args) {
        String str1 = "babad";
        String str2 = "cbbd";
        String str3 = "a";

        System.out.println("Longest Palindrome in '" + str1 + "' is: " + longestPalindrome(str1)); // "bab" or "aba"
        System.out.println("Longest Palindrome in '" + str2 + "' is: " + longestPalindrome(str2)); // "bb"
        System.out.println("Longest Palindrome in '" + str3 + "' is: " + longestPalindrome(str3)); // "a"
    }
}
