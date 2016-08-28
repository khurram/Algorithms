package me.aslam.khurram;

public class Sort {

    public static int[] insertionSort(int[] array) {
        for (int j=1; j<array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i+1] = array[i];
                i = i - 1;
            }
            array[i+1] = key;
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            int minimum = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
        return array;
    }
}