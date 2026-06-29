package com.mmcoe.ds;

public class Queue<Z> {

    private class Node {
        private Z data;
        private Node next;

        public Node(Z data) {
            this.data = data;
        }
    }

    private Node front, rear;
    private int size;

    public void enqueue(Z data) {
        Node n = new Node(data);

        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }

        size++;
    }

    public Z dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue Underflow");

        Z data = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        size--;
        return data;
    }

    public Z peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is Empty");

        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}