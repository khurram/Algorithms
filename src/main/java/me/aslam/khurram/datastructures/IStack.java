package me.aslam.khurram.datastructures;

/**
 * Sample interface for a basic generically typed stack
 * @param <T> the type of the Stack
 */
public interface IStack<T> {

    /**
     * Adds item to top of the stack
     * @param x the item to add to the stack
     */
    void push(T x) throws Exception;

    /**
     * Pop the top item off the stack
     * @return the top item from the stack
     */
    T pop() throws Exception;

    /**
     * Checks if stack is empty
     * @return true if empty otherwise false
     */
    boolean isEmpty();
}