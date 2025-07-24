package org.example.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Convert Roman Numerals to Integer
 * Author: Tushar Kokane
 * Date: 2025-05-14
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < previousValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            previousValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        String roman1 = "III";
        String roman2 = "LVIII";
        String roman3 = "MCMXCIV";

        System.out.println("III -> " + romanToInt(roman1));        // Output: 3
        System.out.println("LVIII -> " + romanToInt(roman2));      // Output: 58
        System.out.println("MCMXCIV -> " + romanToInt(roman3));    // Output: 1994
    }
}
