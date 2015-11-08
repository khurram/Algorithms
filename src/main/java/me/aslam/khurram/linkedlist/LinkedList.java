package me.aslam.khurram.linkedlist;

public class LinkedList {

    public ListElement<Integer> insertInFront(ListElement<Integer> list, int data) {
        ListElement<Integer> l = new ListElement<>(data);
        l.setNext(list);
        return l;
    }

    public ListElement<Integer> find(ListElement<Integer> head, int data) {
        ListElement<Integer> elem = head;
        while (elem.value() != data && elem != null) {
            elem = elem.next();
        }
        return elem;
    }

    public boolean deleteElement(ListElement<Integer> head, ListElement<Integer> deleteMe) {
        ListElement<Integer> elem = head;

        if (head == deleteMe) {
            head = elem.next();
            return true;
        }

        while (elem != null) {
            if (elem.next() == deleteMe) {
                elem.setNext(deleteMe.next());
                return true;
            }
            elem = elem.next();
        }
        return false;
    }

    public void deleteList(ListElement<Integer> head) {
        ListElement<Integer> elem = head;
        while (elem != null) {
            ListElement<Integer> nextElement = elem.next();
            elem.setNext(null);
            elem = nextElement;
        }
        head = null;
    }
}