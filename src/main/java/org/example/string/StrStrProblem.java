/**
 * Problem: strStr - Find first occurrence of a substring
 * Author: Tushar Kokane
 * Date: 2025-05-01
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */

public class StrStrProblem {

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) return i; // match found
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int index = strStr(haystack, needle);
        System.out.println("First occurrence of \"" + needle + "\" is at index: " + index);
    }
}
