package me.aslam.khurram;

public class Fundamentals {

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void zeroArrays(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public static int sumString(String digits) {
        if (digits.isEmpty()) {
            return 0;
        } else {
            int len = digits.length();
            return sumString(digits.substring(1, len)) + Integer.parseInt(digits.substring(0, 1));
        }
    }

    public static int count(String string) {
        if (string.isEmpty()) {
            return 0;
        } else {
            if (string.charAt(0) == 'c') {
                return count(string.substring(1, string.length())) + 1;
            } else {
                return count(string.substring(01, string.length()));
            }
        }
    }
}