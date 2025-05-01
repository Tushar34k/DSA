package org.example.search;

/**
 * Problem: Linear Search
 * Description: Search for a target element in an array using linear search.
 * Author: Tushar Kokane
 * Date: 2025-05-01
 */

public class LinearSearch {

    /**
     * Performs linear search on the given array.
     *
     * @param arr    the array to search
     * @param target the value to find
     * @return the index of the target if found; otherwise -1
     * <p>
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7};
        int target = 9;

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

/*
 * Potential Improvements:
 * - Use Binary Search (O(log n)) if the array is sorted
 * - Add input validation for null or empty arrays
 */
