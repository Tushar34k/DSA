package org.example.array;

/**
 * Problem: Reverse Integer
 * Description: Reverses a 32-bit signed integer, returns 0 on overflow.
 * Link: https://leetcode.com/problems/reverse-integer/
 * Author: Tushar Kokane
 * Date: 2025-05-01
 */

public class ReverseInteger {

    /**
     * Reverses the digits of a signed 32-bit integer.
     *
     * @param x the integer to reverse
     * @return the reversed integer, or 0 if overflow occurs
     *
     * Time Complexity: O(log₁₀(n)) — proportional to the number of digits
     * Space Complexity: O(1)
     */
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();

        System.out.println("Reverse of 123      : " + ri.reverse(123));       // 321
        System.out.println("Reverse of -123     : " + ri.reverse(-123));      // -321
        System.out.println("Reverse of 120      : " + ri.reverse(120));       // 21
        System.out.println("Reverse of 1534236469: " + ri.reverse(1534236469)); // 0 (overflow)
    }
}

/*
 * Possible Improvements:
 * - Handle unsigned input if Java ever supports it natively
 * - Use long instead of int and clamp final result to Integer range
 */
