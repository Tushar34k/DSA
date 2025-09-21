package org.example.string;

/**
 * Problem: Find the Index of the First Occurrence in a String
 * Author: Tushar Kokane
 * Date: 2025-09-09
 *
 * Time Complexity: O((n - m + 1) * m), where n = haystack length, m = needle length
 * Space Complexity: O(1)
 */
public class FirstOccurrenceInString {

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0; // edge case

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Index: " + strStr(haystack1, needle1)); // Output: 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Index: " + strStr(haystack2, needle2)); // Output: -1

        String haystack3 = "hello";
        String needle3 = "ll";
        System.out.println("Index: " + strStr(haystack3, needle3)); // Output: 2
    }
}
