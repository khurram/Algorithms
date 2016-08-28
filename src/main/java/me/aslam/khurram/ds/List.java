package me.aslam.khurram.ds;

/**
 * Implementation of a List backed by a fixed array which doubles itself when full
 * @param <E> the type of the List
 */
public class List<E> implements IList<E> {

    private E[] list;
    private int size;

    /**
     * Constructor to create a new List
     * @param size initial size of the List
     */
    public List(int size) {
        this.list = (E[]) new Object[size];
        this.size = 0;
    }

    public void add(E elem) {
        if (size == list.length - 1) {
            resize();
        }
        list[size] = elem;
        size++;
    }

    public void remove(int index) {
        for (int i=index+1; i<list.length; i++) {
            list[i-1] = list[i];
        }
        size--;
    }

    public E get(int index) {
        return list[index];
    }

    public void set(int index, E elem) {
        list[index] = elem;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    private void resize() {
        E[] newList = (E[]) new Object[list.length * 2];

        for (int i=0; i<list.length; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }
}