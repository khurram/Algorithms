package me.aslam.khurram;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SortTest {

    public int[] unsortedArray = { 2, 7, 3, 4, 9, 8, 1, 5, 6 };
    public int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    @Test
    public void testInsertionSort() {
        int[] sortedArray = Sort.insertionSort(unsortedArray);
        assertTrue("Array did not get sorted", Arrays.equals(expectedArray, sortedArray));
    }

    @Test
    public void testSelectionSort() {
        int[] sortedArray = Sort.selectionSort(unsortedArray);
        assertTrue("Array did not get sorted", Arrays.equals(expectedArray, sortedArray));
    }
}