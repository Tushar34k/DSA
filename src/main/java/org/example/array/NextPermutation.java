package org.example.array;

/**
 * Problem: Next Permutation
 * Author: Tushar Kokane
 * Date: 2025-10-03
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If pivot exists, find the swap candidate
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // For quick testing
    public static void main(String[] args) {
        NextPermutation sol = new NextPermutation();
        int[] nums = {1, 2, 3};
        sol.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 1 3 2
    }
}
