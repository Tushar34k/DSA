package org.example.array;

/**
 * Problem: Find First and Last Position of Element in Sorted Array
 * Author: Tushar Kokane
 * Date: 2025-08-22
 *
 * Description:
 * Given a sorted array nums and a target value, find the starting and ending index of the target.
 * If the target is not found, return [-1, -1].
 * The algorithm must run in O(log n) time complexity using binary search.
 *
 * Example:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3, 4]
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1, -1]
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class FindFirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        result[0] = findBound(nums, target, true);
        if (result[0] == -1) {
            return result; // Target not found
        }
        result[1] = findBound(nums, target, false);
        return result;
    }

    private static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int bound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                bound = mid;
                if (isFirst) {
                    right = mid - 1; // Search left part
                } else {
                    left = mid + 1;  // Search right part
                }
            }
        }
        return bound;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = searchRange(nums1, target1);
        System.out.println("Result: [" + result1[0] + ", " + result1[1] + "]");
        // Output: [3, 4]

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = searchRange(nums2, target2);
        System.out.println("Result: [" + result2[0] + ", " + result2[1] + "]");
        // Output: [-1, -1]

        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = searchRange(nums3, target3);
        System.out.println("Result: [" + result3[0] + ", " + result3[1] + "]");
        // Output: [-1, -1]
    }
}
