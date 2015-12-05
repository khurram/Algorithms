package me.aslam.khurram.datastructures;

/**
 * Generic implementation of a ListNode to be used in a linked list
 *
 * @param <T> the type of the ListNode
 */
public class ListNode<T> {

    private T key;
    private ListNode<T> next;

    public ListNode() {
    }

    /**
     * Create new ListNode with key set to passed in value
     *
     * @param value initial key value
     */
    public ListNode(T value) {
        key = value;
    }

    /**
     * Pointer to next ListNode element
     *
     * @return next ListNode
     */
    public ListNode<T> next() {
        return next;
    }

    /**
     * Sets next ListNode element
     *
     * @param node next ListNode
     */
    public void setNext(ListNode<T> node) {
        next = node;
    }

    /**
     * Returns the key of the current node
     *
     * @return key
     */
    public T key() {
        return key;
    }

    /**
     * Sets the value of the key
     *
     * @param value value of the key
     */
    public void setKey(T value) {
        this.key = value;
    }
}