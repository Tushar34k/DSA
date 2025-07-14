package org.example.pointer;

import java.util.Arrays;

public class Dublicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 40};

        Arrays.sort(arr);  // Only needed if not already sorted

        int left = 0;
        int right = 1;

        while (right < arr.length) {
            if (arr[left] == arr[right]) {
                System.out.println("Duplicate found: " + arr[left]);
                // Uncomment if you want to find all duplicates
                // right++;
                // left++;
                return;
            }
            left++;
            right++;
        }

        System.out.println("No duplicates found.");
    }

}
