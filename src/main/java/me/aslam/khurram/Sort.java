package me.aslam.khurram;

public class Sort {

    public static int[] insertionSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            int a = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > a) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = a;
        }
        return array;
    }
}
