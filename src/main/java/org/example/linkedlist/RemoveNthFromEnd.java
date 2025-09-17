package org.example.linkedlist;


/**
 * Problem: Remove Nth Node From End of List
 * Author: Tushar Kokane
 * Date: 2025-09-09
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node simplifies removal process
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first pointer n+1 steps ahead to maintain gap
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the target node
        second.next = second.next.next;

        return dummy.next;
    }

    // Helper function to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create linked list 1->2->3->4->5
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println("Original List:");
        printList(head);

        // Remove the 2nd node from the end, should remove '4'
        head = removeNthFromEnd(head, 2);

        System.out.println("After removing 2nd node from end:");
        printList(head);
    }
}

