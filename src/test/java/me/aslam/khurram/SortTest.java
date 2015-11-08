package me.aslam.khurram;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SortTest {

    @Test
    public void testInsertionSort() {
        int[] unsortedArray = { 2, 7, 3, 4, 9, 8, 1, 5, 6 };
        int[] sortedArray = Sort.insertionSort(unsortedArray);
        int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        assertTrue("Array did not get sorted", Arrays.equals(expectedArray, sortedArray));
    }
}