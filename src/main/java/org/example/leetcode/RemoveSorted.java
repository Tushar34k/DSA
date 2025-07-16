package org.example.leetcode;

/**
 * Problem: Remove Duplicates from Sorted Array
 * Author: Tushar Kokane
 * Date: 2025-05-14
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Given a sorted array 'nums', remove the duplicates in-place such that each unique element appears only once.
 * Return the number of unique elements, k. Modify 'nums' in-place to contain the first k unique values.
 */

public class RemoveSorted {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        RemoveSorted sol = new RemoveSorted();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

