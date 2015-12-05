package me.aslam.khurram.datastructures;

import me.aslam.khurram.datastructures.ListNode;

/**
 * Generic implementation of a Stack backed by a linked list. As with the LinkedList, the operations
 * in this class are static utility functions not methods to be used on the Stack object.
 *
 * @param <T> type of the stack
 */
public class Stack<T> {

    private ListNode<T> stack;

    /**
     * Constructor to create a new stack using a LinkedList
     *
     * @return an empty ListNode representing the stack
     */
    public ListNode<T> Stack() {
        stack = new ListNode<>();
        return stack;
    }

    /**
     * Push data on the to the top of the stack in O(1) time
     *
     * @param stack head of the stack
     * @param data  data to push onto stack
     * @return new head of the linked list
     */
    public static <T> ListNode<T> push(ListNode<T> stack, T data) {
        ListNode<T> node = new ListNode<>(data);
        node.setNext(stack);
        return node;
    }

    /**
     * Pops data off the top of the stack in O(1) time
     *
     * @param stack head of the stack
     * @return new head of the linked list
     */
    public static <T> ListNode<T> pop(ListNode<T> stack) {
        ListNode<T> head = stack;
        stack = stack.next();
        return head;
    }

    /**
     * Checks if the stack is empty in O(1) time
     *
     * @return true if the stack is empty, false otherwise
     */
    public static <T> boolean isEmpty(ListNode<T> stack) {
        if (stack == null) {
            return true;
        }
        return false;
    }
}
