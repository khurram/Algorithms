package me.aslam.khurram.datastructures;

/**
 * Sample interface for a generically typed Queue
 * @param <T> the type of the Queue
 */
public interface IQueue<T> {

    /**
     * Add item to the queue
     * @param x item to add to the queue
     */
    void enqueue(T x);

    /**
     * Remove the first in the queue
     * @return first item in the queue
     */
    T dequeue();

    /**
     * Check if the queue is empty
     * @return true if queue is empty false otherwise
     */
    boolean isEmpty();
}
