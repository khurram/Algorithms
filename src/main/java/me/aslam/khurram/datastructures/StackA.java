package me.aslam.khurram.datastructures;

/**
 * Implementation of a stack backed by an int array
 */
public class StackA {

    private int[] stack;
    private int top;

    /**
     * Constructor to create a new stack
     * @param size length of the stack
     * @return new stack of given length
     */
    public int[] StackA(int size) {
        stack = new int[size];
        top = -1;
        return stack;
    }

    /**
     * Push an int onto the top of the stack
     * @param data int to put on the top of the stack
     * @throws Exception
     */
    public void push(int data) throws Exception {
        if (top == stack.length) {
            throw new Exception("Stack is full");
        }
        top = top + 1;
        stack[top] = data;
    }

    /**
     * Pop an int off the top of the stack
     * @return int from the top of the stack
     * @throws Exception
     */
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        } else {
            top = top - 1;
            return stack[top+1];
        }
    }

    /**
     * Check if the stack is empty
     * @return true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
}
