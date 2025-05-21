package org.example.leetcode;

import java.util.HashSet;
import java.util.*;

class Solution {
    public static String longestPalindrome(String s) {
        Set set = new HashSet();
        String first = "";
//            String secound = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//                first += ch;
            sb.append(ch);
//                secound+=ch;
//                System.out.println(ch);
            if (set.contains(ch)) {
                String current = sb.toString();// bb
                System.out.println("am current=" + current);
                StringBuilder remover = new StringBuilder(current);
                String rev = remover.reverse().toString();//bb
                System.out.println("am remover=" + rev);
                if (stringMatcher(current, rev)) {
//                        System.out.println(first+"**");
                    if (current.length() > first.length()) {
                        first = current;
                        System.out.println("am first" + first);
                        return first;
                    }
                }
                set.clear();
                sb.setLength(0);
                System.out.println("am current=" + current);
                System.out.println("am remover=" + rev);

            }

            set.add(ch);
//                System.out.println(set);
        }
        return first;
    }

    public static boolean stringMatcher(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String arg[]) {
        String str = "cbbd";
        System.out.println(Solution.longestPalindrome(str));
        System.out.println("hii");
    }

}
