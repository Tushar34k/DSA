package org.example.search;

/**
 * Problem: Binary Search
 * Description: Search for a target element in a sorted array using binary search.
 * Author: Tushar Kokane
 * Date: 2025-05-01
 */

public class BinarySearch {

    /**
     * Performs binary search on a sorted array.
     *
     * @param arr    the sorted array to search
     * @param target the value to find
     * @return the index of the target if found; otherwise -1
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}

/*
 * Potential Improvements:
 * - Handle edge cases: null input, unsorted array
 * - Implement recursive version
 * - Make generic for different data types
 */

