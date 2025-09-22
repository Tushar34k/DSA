package org.example.string;

import java.util.Stack;

/**
 * Problem: Valid Parentheses
 * Author: Tushar Kokane
 * Date: 2025-09-21
 *
 * Time Complexity: O(n), where n = length of string
 * Space Complexity: O(n) for stack
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // push opening brackets
            } else {
                if (stack.isEmpty()) return false; // no opening bracket
                char top = stack.pop();

                // check matching pairs
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // all brackets matched
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println(s1 + " -> " + isValid(s1)); // true
        System.out.println(s2 + " -> " + isValid(s2)); // true
        System.out.println(s3 + " -> " + isValid(s3)); // false
        System.out.println(s4 + " -> " + isValid(s4)); // false
        System.out.println(s5 + " -> " + isValid(s5)); // true
    }
}
