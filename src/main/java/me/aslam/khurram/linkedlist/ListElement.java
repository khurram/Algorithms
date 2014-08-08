package me.aslam.khurram.linkedlist;

public class ListElement<T> {
    
    private ListElement<T> next;
    private T data;
    
    public ListElement() {
    }
    
    public ListElement(T value) {
        data = value;
    }
    
    public ListElement<T> next() {
        return next;
    }
    
    public void setNext(ListElement<T> elem) {
        this.next = elem;
    }
    
    public T value() {
        return data;
    }
    
    public void setValue(T value) {
        this.data = value;
    }
}
