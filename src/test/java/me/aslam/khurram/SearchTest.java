package me.aslam.khurram;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

    @Test
    public void testLinearSearch() {
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        int result = Search.linearSearch(array, key);

        assertEquals("Index should be 5", key, result);
    }

    @Test
    public void testBinarySearch() {
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        int result = Search.binarySearch(array, key, 0, array.length);

        assertEquals("Index should be 5", key, result);
    }
    
    @Test
    public void testBinarySearchNonRecursive() {
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 5;
        int result = Search.binarySearchNonRecursive(array, key, 0, array.length);

        assertEquals("Index should be 5", key, result);
    }

    @Test
    public void testFindMax() {
        int[] array = { 0, 1, 2, 3, 4, 10, 6, 7, 8, 9 };
        int result = Search.findMax(array);

        assertEquals("Max should be 10", 10, result);
    }
}
