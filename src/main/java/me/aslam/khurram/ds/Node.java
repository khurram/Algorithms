package me.aslam.khurram.ds;

/**
 * Implementation of a Node to be used in a LinkedList
 * @param <E> the type of the Node
 */
public class Node<E> {

    private E key;
    private Node<E> next;

    /**
     * Create a new Node with empty key
     */
    public Node() {
    }

    /**
     * Create new Node with key set to passed in value
     * @param value initial key value
     */
    public Node(E value) {
        this.key = value;
    }

    /**
     * Get the key
     * @return key
     */
    public E getKey() {
        return this.key;
    }

    /**
     * Set the key
     * @param key
     */
    public void setKey(E key) {
        this.key = key;
    }

    /**
     * Get next element
     * @return next
     */
    public Node<E> getNext() {
        return this.next;
    }

    /**
     * Set next element
     * @param next
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }
}