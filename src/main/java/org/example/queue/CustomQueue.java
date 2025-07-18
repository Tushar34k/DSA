package org.example.queue;

import java.util.NoSuchElementException;

/**
 * Problem: Implement a Custom Queue with Basic Operations (enqueue, dequeue, peek, isEmpty, size)
 * Author: Tushar Kokane
 * Date: 2025-05-14
 *
 * Time Complexity:
 *   Enqueue: O(1)
 *   Dequeue: O(1)
 *   Peek: O(1)
 *   isEmpty: O(1)
 *   Size: O(1)
 *
 * Space Complexity: O(n)
 */

public class CustomQueue<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public CustomQueue() {
        front = rear = null;
        size = 0;
    }

    // Enqueue operation
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue operation
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T value = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return value;
    }

    // Peek front element
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get size of the queue
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Is Empty: " + queue.isEmpty());
    }
}
