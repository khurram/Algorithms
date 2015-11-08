package me.aslam.khurram.datastructures;

import me.aslam.khurram.linkedlist.ListElement;

public class Stack {

    private ListElement<Integer> stack;

    public Stack() {
        this.stack = createStack();
    }

    public Stack(ListElement<Integer> stack) {
        this.stack = stack;
    }

    public ListElement<Integer> createStack() {
        ListElement<Integer> stack = new ListElement<>();
        return stack;
    }

    public void deleteStack(ListElement<Integer> stack) {
        ListElement<Integer> elem = stack;
        while (elem != null) {
            ListElement<Integer> nextElement = elem.next();
            elem.setNext(null);
            elem = nextElement;
        }
        stack = null;
    }

    public ListElement<Integer> push(ListElement<Integer> stack, int data) {
        ListElement<Integer> elem = new ListElement<>(data);
        elem.setNext(stack);
        return elem;
    }

    public ListElement<Integer> pop(ListElement<Integer> stack) {
        ListElement<Integer> head = stack;
        stack = stack.next();
        return head;
    }

    boolean isEmpty() {
        if (stack == null) {
            return true;
        }
        return false;
    }
}