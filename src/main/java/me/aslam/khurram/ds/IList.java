package me.aslam.khurram.ds;

/**
 * Sample interface for a generically typed List
 * @param <E> the type of the List
 */
public interface IList<E> {

    /**
     * Add an element to the list
     * @param elem to add to the list
     */
    void add(E elem);

    /**
     * Remove an element from the list
     * @param elem to remove from the list
     */
    void remove(int index);

    /**
     * Get an element from the list
     * @param index of the element in the list
     * @return the element
     */
    E get(int index);

    /**
     * Set an element in the list
     * @param index of the element to set
     * @param elem element to set
     */
    void set(int index, E elem);

    /**
     * Check if the list is empty
     * @return true if list is empty, otherwise false
     */
    boolean isEmpty();

    /**
     * The size of the list
     * @return number of items in the list
     */
    int size();
}