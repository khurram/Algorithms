package me.aslam.khurram.datastructures;

/**
 * Implementation of a Queue backed by a generically typed array
 * @param <T> type of the queue
 */
public class Queue<T> implements IQueue<T> {

    private T[] queue;
    private int head;
    private int tail;

    /**
     * Constructor to create a new Queue of length 10
     */
    public Queue() {
        queue = (T[]) new Object[10];
        head = 0;
        tail = 0;
    }

    /**
     * Adds item to the end of the queue
     * @param data to be added to the queue
     */
    public void enqueue(T data) {
        queue[tail] = data;
        if (tail == queue.length) {
            tail = 0; // wrap round
        } else {
            tail += 1;
        }
    }

    /**
     * Removes item from the head of the queue
     * @return first item in line
     */
    public T dequeue() {
        T item = queue[head];
        if (head == queue.length) {
            head = 1;
        } else {
            head += 1;
        }
        return item;
    }

    /**
     * Checks if queue is empty. Doesn't account for overflow
     * @return true if empty false otherwise
     */
    public boolean isEmpty() {
        if (head == tail) {
            return true;
        } else {
            return false;
        }
    }
}
