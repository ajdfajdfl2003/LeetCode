package com.angus.leetcode.data.structure;

public class MyCircularQueue {
    private final int[] myQueue;
    private int front = -1;
    private int rear = -1;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public MyCircularQueue(int k) {
        myQueue = new int[k];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (this.isFull()) return false;
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % myQueue.length;
        myQueue[rear] = value;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) return false;
        if (front == rear) {
            front = -1;
            rear = -1;
            return true;
        }
        front = (front + 1) % myQueue.length;
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return isEmpty() ? -1 : myQueue[front];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return isEmpty() ? -1 : myQueue[rear];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return front == -1;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return ((rear + 1) % myQueue.length) == front;
    }
}
