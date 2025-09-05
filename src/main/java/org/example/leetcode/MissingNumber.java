package org.example.leetcode;


/**
 * Problem: Find the Missing Number in an Array
 * Author: Tushar Kokane
 * Date: 2025-08-22
 *
 * Description:
 * You are given an array containing `n` distinct numbers taken from `0, 1, 2, ..., n`.
 * Find the one number that is missing from the array.
 *
 * Example 1:
 * Input: nums = [3, 0, 1]
 * Output: 2
 *
 * Example 2:
 * Input: nums = [0, 1]
 * Output: 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // sum of 0..n
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println("Missing number in [3,0,1] -> " + findMissingNumber(nums1)); // Output: 2
        System.out.println("Missing number in [0,1] -> " + findMissingNumber(nums2));   // Output: 2
        System.out.println("Missing number in [9,6,4,2,3,5,7,0,1] -> " + findMissingNumber(nums3)); // Output: 8
    }
}
