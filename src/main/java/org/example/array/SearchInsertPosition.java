package org.example.array;

/**
 * Problem: Search Insert Position
 * Author: Tushar Kokane
 * Date: 2025-09-21
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        // if not found, left will be the insert position
        return left;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        System.out.println("Insert position: " + searchInsert(nums1, 5)); // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        System.out.println("Insert position: " + searchInsert(nums2, 2)); // Output: 1

        int[] nums3 = {1, 3, 5, 6};
        System.out.println("Insert position: " + searchInsert(nums3, 7)); // Output: 4
    }
}
