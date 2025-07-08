package org.example.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: Merge Two Arrays into a Single List
 * Author: Tushar Kokane
 * Date: 2025-05-14
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

public class MergeTwoArray {

    public static List<Integer> mergeArrays(int[] arr1, int[] arr2) {
        List<Integer> mergedList = new ArrayList<>(arr1.length + arr2.length);

        for (int num : arr1) {
            mergedList.add(num);
        }

        for (int num : arr2) {
            mergedList.add(num);
        }

        return mergedList;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50};

        List<Integer> result = mergeArrays(arr1, arr2);
        System.out.println("Merged List: " + result);
    }
}
