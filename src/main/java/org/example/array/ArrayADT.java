package org.example.array;

import java.util.Scanner;

/**
 * Program: Array ADT (Insert Operation)
 * Description: Demonstrates insertion in a static array structure.
 * Author: Your Name
 * Date: 2025-05-01
 */

public class ArrayADT {
    private int[] arr;
    private int size;
    private int capacity;

    // Constructor to initialize array
    public ArrayADT(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    /**
     * Inserts a value into the array if space is available.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(n) for array allocation
     *
     * @param value element to insert
     */
    public void insert(int value) {
        if (size < capacity) {
            arr[size++] = value;
            System.out.println("Inserted: " + value);
        } else {
            System.out.println("Array is full. Cannot insert " + value);
        }
    }

    /**
     * Displays the current contents of the array.
     */
    public void display() {
        System.out.print("Array contents: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayADT arrayADT = new ArrayADT(5); // Array with max capacity 5

        while (true) {
            System.out.print("Enter number to insert (-1 to stop): ");
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            arrayADT.insert(num);
        }

        arrayADT.display();
    }
}
