package org.example.array;

/**
 * Problem: Move Zeroes to End
 * Author: Tushar Kokane
 * Date: 2025-05-01
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int index = 0; // Pointer to place the next non-zero element

        // First pass: Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Second pass: Fill remaining positions with zero
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        System.out.print("Result: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
