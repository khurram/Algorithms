package me.aslam.khurram.ds;

/**
 * Sample interface for a generically typed Queue
 * @param <E> the type of the Queue
 */
public interface IQueue<E> {

    /**
     * Add item to the queue
     * @param item to add to the queue
     */
    void enqueue(E item);

    /**
     * Remove the first in the queue
     * @return first item in the queue
     * @throws Exception if queue is empty
     */
    E dequeue() throws Exception;

    /**
     * Check if the queue is empty
     * @return true if queue is empty, otherwise false
     */
    boolean isEmpty();
}