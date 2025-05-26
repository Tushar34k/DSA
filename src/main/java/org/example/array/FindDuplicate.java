package org.example.array;

/**
 * Problem: Find the Duplicate Number (Floyd's Algorithm)
 * Author: Tushar Kokane
 * Date: 2025-05-01
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: Find intersection point of two runners
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find entrance to cycle (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate Number: " + duplicate);  // Output: 3
    }
}

