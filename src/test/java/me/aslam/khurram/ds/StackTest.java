package me.aslam.khurram.ds;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {

    private static final int INITIAL_CAPACITY = 10;

    @Test
    public void testPush() throws Exception {
        IStack<Integer> myStack = new Stack<>(INITIAL_CAPACITY);
        assertEquals("Stack should be empty before pushing", true, myStack.isEmpty());
        myStack.push(3);
        assertEquals("Stack should not be empty", false, myStack.isEmpty());
    }

    @Test
    public void testResize() throws Exception {
        IStack<Integer> myStack = new Stack<>(INITIAL_CAPACITY);
        assertEquals("Stack should be empty before pushing", true, myStack.isEmpty());

        // append 5x the initial size of the stack array
        for (int i=0; i<50; i++) {
            myStack.push(i);
        }
    }

    @Test
    public void testPop() throws Exception {
        IStack<Integer> myStack = new Stack<>(INITIAL_CAPACITY);
        myStack.push(3);
        int poppedValue = myStack.pop();
        assertEquals("Popped value is not correct", 3, poppedValue);
    }

    @Test
    public void testIsEmpty() throws Exception {
        IStack<Integer> emptyStack = new Stack<>(INITIAL_CAPACITY);
        assertEquals("Stack is not empty", true, emptyStack.isEmpty());

        IStack<Integer> nonEmptyStack = new Stack<>(INITIAL_CAPACITY);
        nonEmptyStack.push(3);
        assertEquals("Stack is empty", false, nonEmptyStack.isEmpty());
    }
}
