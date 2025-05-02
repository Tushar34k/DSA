package org.example.sorting;

/**
 * Problem: Selection Sort
 * Description: Sorts an array of integers using the Selection Sort algorithm.
 * Author: Your Name
 * Date: 2025-05-01
 */

public class SelectionSort {

    /**
     * Sorts the given array using Selection Sort.
     *
     * @param arr the array of integers to be sorted
     * @return the sorted array
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the current position
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] input = {64, 25, 12, 22, 11};
        int[] sorted = selectionSort(input);

        System.out.print("Sorted Array: ");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Potential Improvements:
 * - Handle null or empty input arrays
 * - Add input validation
 * - Make it generic for other data types
 */
