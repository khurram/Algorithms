package me.aslam.khurram.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @Test
    public void testInsert() {
        ListNode<Integer> head = new ListNode<>(5);
        ListNode<Integer> node = LinkedList.insert(head, 5);
        assertEquals("Did not correctly insert head node", 5, (int) node.key());
    }

    @Test
    public void testSearch() {
        ListNode<Integer> list = new ListNode<>(5);
        ListNode<Integer> node = LinkedList.search(list, 5);
        assertEquals("Did not correctly search for key", 5, (int) node.key());
    }

    @Test
    public void testDelete() {
        ListNode<Integer> head = new ListNode<>(5);
        ListNode<Integer> node = LinkedList.insert(head, 5);
        node.setKey(10);
        Boolean status = LinkedList.delete(node, head);
        assertEquals("Did not correctly delete key", true, status);
        assertEquals("Did not correctly delete key", null, node.next());
    }
}
