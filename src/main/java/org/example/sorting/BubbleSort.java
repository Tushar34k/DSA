package org.example.sorting;

/**
 * Problem: Bubble Sort
 * Description: Sorts an array of integers using the Bubble Sort algorithm.
 * Author: Tushar Kokane
 * Date: 2025-05-01
 */

public class BubbleSort {

    /**
     * Sorts the input array using Bubble Sort.
     *
     * @param input the array of integers
     * @return the sorted array
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static int[] bubbleSort(int[] input) {
        int temp;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    // Swap elements
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = {10, 30, 50, 20, 40};
        int[] out = bubbleSort(input);

        System.out.print("Sorted Array: ");
        for (int k : out) {
            System.out.print(k + " ");
        }
    }
}

/*
 * Potential Improvements:
 * - Add a boolean flag to optimize by stopping early if no swaps occur in a pass
 * - Handle null or empty input arrays
 * - Use generics to make this sort reusable across data types
 */
