package org.example.leetcode;


import java.util.*;

/**
 * Problem: 4Sum
 * Author: Tushar Kokane
 * Date: 2025-05-01
 *
 * Time Complexity: O(n^3)
 * Space Complexity: O(1) (excluding output list)
 */

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        if (n < 4) return result;

        Arrays.sort(nums); // Sort array to use two-pointer and avoid duplicates

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate i

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicate j

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right]; // Use long to avoid overflow

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        System.out.println("Output: " + fourSum(nums1, target1));

        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        System.out.println("Output: " + fourSum(nums2, target2));
    }
}

