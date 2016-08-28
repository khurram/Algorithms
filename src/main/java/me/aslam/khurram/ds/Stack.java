package me.aslam.khurram.ds;

/**
 * Implementation of a Stack backed by a fixed array which doubles itself when full
 * @param <E> the type of the Stack
 */
public class Stack<E> implements IStack<E> {

    private E[] stack;
    private int top;

    /**
     * Constructor to create a new stack
     * @param size initial size of the stack
     */
    public Stack(int size) {
        this.stack = (E[]) new Object[size];
        this.top = -1;
    }

    public void push(E item) {
        if (isFull()) {
            resize();
        }
        top++;
        stack[top] = item;
    }

    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        } else {
            E poppedItem = stack[top];
            stack[top] = null; // woohoo GC do your thing
            top--;
            return poppedItem;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return top + 1;
    }

    private void resize() {
        E[] newStack = (E[]) new Object[stack.length * 2];
        for (int i=0; i<stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    private boolean isFull() {
        if (top == stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}