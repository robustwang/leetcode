package com.test.leetcode.sort;

public class InsertionSortDemo {
     static int[] insertionSort(int[] a, int n) {
        if (n <= 1) return null;
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 1, 2, 3};
        int[] ints = InsertionSortDemo.insertionSort(array, 6);
        for (int i : ints) {
            System.out.println(i);
        }

    }

}
