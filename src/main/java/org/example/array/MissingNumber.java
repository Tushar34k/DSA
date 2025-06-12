package org.example.array;

/**
 * Problem: Find the Missing Number
 * Author: Your Name
 * Date: 2025-05-01
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing Number: " + findMissingNumber(nums)); // Output: 2
    }
}

