package me.aslam.khurram.linkedlist;

public class ListElementDouble<T> {
    
    private ListElementDouble<T> next;
    private ListElementDouble<T> previous;
    private T data;
    
    public ListElementDouble(T data) {
        this.data = data;
    }
    
    public ListElementDouble<T> next() {
        return this.next;
    }
    
    public void setNext(ListElementDouble<T> next) {
        this.next = next;
    }
    
    public ListElementDouble<T> previous() {
        return this.previous;
    }
    
    public void setPrevious(ListElementDouble<T> previous) {
        this.previous = previous;
    }
    
    public T value() {
        return this.data;
    }
    
    public void setValue(T value) {
        this.data = value;
    }

}
