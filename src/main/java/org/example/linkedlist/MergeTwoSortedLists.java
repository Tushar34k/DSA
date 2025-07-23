package org.example.linkedlist;

/**
 * Problem: Merge Two Sorted Linked Lists
 * Leetcode: https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Author: Tushar Kokane
 * Date: 2025-05-14
 *
 * Time Complexity: O(n + m) — where n and m are the lengths of the two lists
 * Space Complexity: O(n + m) for recursive stack
 */

public class MergeTwoSortedLists {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Solution class
    public static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
    }

    // Test example
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        Solution solution = new Solution();
        ListNode merged = solution.mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
