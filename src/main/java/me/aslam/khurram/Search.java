package me.aslam.khurram;

public class Search {

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key, int low, int high) {
        if (high < low) {
            return -1;
        } else {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (key < mid) {
                return binarySearch(array, key, low, mid - 1);
            } else {
                return binarySearch(array, key, mid + 1, high);
            }
        }
    }

    public static int binarySearchNonRecursive(int[] array, int key, int low, int high) {
        if (high < low) {
            return -1;
        } else {
            int mid = (low + high) / 2;

            while (low <= high) {
                if (array[mid] == key) {
                    return mid;
                } else if (key < mid) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int entry : array) {
            if (entry > max) {
                max = entry;
            }
        }
        return max;
    }
}
