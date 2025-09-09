package org.example.leetcode;

/**
 * Problem: Move Zeroes
 * Author: Tushar Kokane
 * Date: 2025-08-22
 *
 * Description:
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * You must do this in-place without making a copy of the array.
 *
 * Example:
 * Input: nums = [0, 1, 0, 3, 12]
 * Output: [1, 3, 12, 0, 0]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int lastNonZero = 0;

        // Move all non-zero elements to the beginning
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero++] = nums[i];
            }
        }

        // Fill the rest with zeroes
        for (int i = lastNonZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.print("After moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Expected Output: 1 3 12 0 0
    }
}
