package me.aslam.khurram.ds;

/**
 * Sample interface for a generically typed Stack
 * @param <E> the type of the Stack
 */
public interface IStack<E> {

    /**
     * Push an item on the stack
     * @param item to push on the stack
     */
    void push(E item);

    /**
     * Pop the top item off the stack
     * @return the item on the top of the stack
     * @throws Exception if stack is empty
     */
    E pop() throws Exception;

    /**
     * Checks if the stack is empty
     * @return true if stack is empty, otherwise false
     */
    boolean isEmpty();

    /**
     * The size of the stack
     * @return number of items in the stack
     */
    int size();
}