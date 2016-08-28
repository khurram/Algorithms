package me.aslam.khurram.ds;

/**
 * Implementation of a Queue backed by a fixed array
 * @param <E> the type of the queue
 */
public class Queue<E> implements IQueue<E> {

    private E[] queue;
    private int head;
    private int tail;

    /**
     * Constructor to create a new Queue
     */
    public Queue(int size) {
        queue = (E[]) new Object[size];
        head = 0;
        tail = 0;
    }

    public void enqueue(E item) {
        queue[tail] = item;
        if (tail == queue.length - 1) {
            tail = 0; // wrap round
        } else {
            tail++;
        }
    }

    public E dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            E item = queue[head];
            if (head == queue.length - 1) {
                head = 0;
            } else {
                head++;
            }
            return item;
        }
    }

    public boolean isEmpty() {
        if (head == tail) {
            return true;
        } else {
            return false;
        }
    }
}
