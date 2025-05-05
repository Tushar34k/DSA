package org.example.search;

/**
 * Problem: Insertion Sort
 * Description: Sorts an array of integers using the Insertion Sort algorithm.
 * Author: Your Name
 * Date: 2025-05-01
 */

public class InsertionSort {

    /**
     * Sorts the given array using Insertion Sort.
     *
     * @param arr the array of integers to sort
     * @return the sorted array
     *
     * Time Complexity: O(n^2) in the worst case, O(n) in the best case (when the array is already sorted)
     * Space Complexity: O(1)
     */
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than current,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = {9, 5, 1, 4, 3};
        int[] sorted = insertionSort(input);

        System.out.print("Sorted Array: ");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Potential Improvements:
 * - Handle null or empty arrays
 * - Make it work with generic types using Comparable<T>
 * - Count and return number of swaps or comparisons if analyzing performance
 */
