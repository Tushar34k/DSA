package org.example.string;

/**
 * Problem: Multiply Strings
 * Author: Tushar Kokane
 * Date: 2025-09-21
 *
 * Time Complexity: O(n * m), where n = length of num1, m = length of num2
 * Space Complexity: O(n + m) for result array
 */
public class MultiplyStrings {

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];

        // multiply each digit from num1 and num2
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1]; // add to existing position

                result[i + j + 1] = sum % 10;      // store single digit
                result[i + j] += sum / 10;         // carry
            }
        }

        // convert result array to string
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // skip leading zeros
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "2", num2 = "3";
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2)); // Output: 6

        String num3 = "123", num4 = "456";
        System.out.println(num3 + " * " + num4 + " = " + multiply(num3, num4)); // Output: 56088
    }
}
