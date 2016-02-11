package me.aslam.khurram.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackATest {

    @Test
    public void testPush() throws Exception {
        IStack<Integer> myStack = new StackA<>();
        assertEquals("Stack should be empty before pushing", true, myStack.isEmpty());
        myStack.push(10);
        assertEquals("Stack should not be empty", false, myStack.isEmpty());
    }

    @Test
    public void testPop() throws Exception {
        IStack<Integer> myStack = new StackA<>();
        myStack.push(10);
        int poppedValue = myStack.pop();
        assertEquals("Value popped is not correct", 10, poppedValue);
    }

    @Test
    public void testIsEmpty() throws Exception {
        IStack<Integer> emptyStack = new StackA<>();
        assertEquals("Stack is not empty", true, emptyStack.isEmpty());

        IStack<Integer> nonEmptyStack = new StackA<>();
        nonEmptyStack.push(10);
        assertEquals("Stack is empty", false, nonEmptyStack.isEmpty());
    }
}
