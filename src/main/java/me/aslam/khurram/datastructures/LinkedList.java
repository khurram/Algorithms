package me.aslam.khurram.datastructures;

import me.aslam.khurram.datastructures.ListNode;

/**
 * Generic implementation of a LinkedList. Includes utility methods that perform general operations.
 *
 * @param <T> type of the linked list
 */
public class LinkedList<T> {

    private ListNode<T> linkedList;

    /**
     * Constructor to return an empty LinkedList
     *
     * @return empty LinkedList
     */
    public ListNode<T> LinkedList() {
        linkedList = new ListNode<>();
        return linkedList;
    }

    /**
     * Inserting a value at the front of the linked list in O(1) time
     *
     * @param head head of the existing list
     * @param key  new value to put at the start of the list
     * @return head of the new list
     */
    public static <T> ListNode<T> insert(ListNode<T> head, T key) {
        ListNode<T> node = new ListNode<>(key);
        node.setNext(head);
        return node;
    }

    /**
     * Search for a key in a linked list in O(n) time
     *
     * @param head head of the linked list
     * @param key  key to be searched for
     * @return node with the search key or null if it does not exist
     */
    public static <T> ListNode<T> search(ListNode<T> head, T key) {
        ListNode<T> node = head;
        while (node != null && node.key() != key) {
            node = node.next();
        }
        return node;
    }

    /**
     * Searches for the node to be deleted and removes it from the list in O(n) time
     *
     * @param head       head of the linked list
     * @param deleteNode node to be deleted
     * @return true if node is found and deleted, false otherwise
     */
    public static <T> boolean delete(ListNode<T> head, ListNode<T> deleteNode) {
        ListNode<T> node = head;

        if (head == deleteNode) {
            head = node.next();
            return true;
        }

        while (node != null) {
            if (node.next() == deleteNode) {
                node.setNext(deleteNode.next());
                return true;
            }
            node = node.next();
        }
        return false;
    }

    /**
     * Delete a linked list by setting all the pointers to null in O(n) time
     *
     * @param head head of the linked list
     */
    public static <T> void deleteList(ListNode<T> head) {
        ListNode<T> node = head;
        while (node != null) {
            ListNode<T> nextNode = node.next();
            node.setNext(null);
            node = nextNode;
        }
        head = null;
    }
}