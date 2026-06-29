package com.mmcoe.ds;

public class Stack<Z> {

    private class Node {
        private Z data;
        private Node next;

        public Node(Z data) {
            this.data = data;
        }
    }

    private Node top;
    private int size;

    public void push(Z data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
        size++;
    }

    public Z pop() {
        if (isEmpty())
            throw new RuntimeException("Stack Underflow");

        Z data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public Z peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is Empty");

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}