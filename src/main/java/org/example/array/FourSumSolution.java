package org.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem: 4Sum
 * Author: Tushar Kokane
 * Date: 2025-10-02
 *
 * Time Complexity: O(n^3)  (fix two indices and use two-pointer for the remaining two)
 * Space Complexity: O(1)   (excluding the space required for the output list)
 *
 * Given an array nums of n integers, return all unique quadruplets [nums[a], nums[b], nums[c], nums[d]]
 * such that a, b, c, and d are distinct and nums[a] + nums[b] + nums[c] + nums[d] == target.
 */
public class FourSumSolution {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // skip duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // skip duplicates for left and right
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
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
        System.out.println("Input: " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + fourSum(nums1, target1));
        // Expected: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        System.out.println("Input: " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + fourSum(nums2, target2));
        // Expected: [[2,2,2,2]]
    }
}
