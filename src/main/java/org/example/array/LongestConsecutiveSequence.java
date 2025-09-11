package org.example.array;

import java.util.Arrays;

/**
 * Problem: Longest Consecutive Sequence (Simple Approach)
 * Author: Tushar Kokane
 * Date: 2025-08-22
 *
 * Description:
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * This solution sorts the array and then finds the longest consecutive sequence.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 200, 2, 100};

        Arrays.sort(nums);

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }
            if (nums[i] == nums[i - 1] + 1) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            maxLen = Math.max(maxLen, currentLen);
        }

        System.out.println("Longest consecutive sequence length: " + maxLen);
        // Expected output: 5 (for sequence 1,2,3,4,5)
    }
}
