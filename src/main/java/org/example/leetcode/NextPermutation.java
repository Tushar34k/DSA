package org.example.array;

import java.util.Arrays;

/**
 * Problem: Next Permutation
 * Author: Tushar Kokane
 * Date: 2025-08-22
 *
 * Description:
 * Given an array of integers nums, rearrange it into the next lexicographically greater permutation.
 * If such arrangement is not possible, rearrange it as the lowest possible order (i.e., sorted in ascending order).
 * The rearrangement must be done in place and with constant extra memory.
 *
 * Example:
 * Input: nums = [1, 2, 3]
 * Output: [1, 3, 2]
 *
 * Input: nums = [3, 2, 1]
 * Output: [1, 2, 3]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the element just larger than nums[i]
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap elements at i and j
            swap(nums, i, j);
        }

        // Step 4: Reverse the elements after position i
        reverse(nums, i + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
        // Output: [1, 3, 2]
    }
}
