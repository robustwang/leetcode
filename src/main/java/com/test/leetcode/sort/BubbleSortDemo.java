package com.test.leetcode.sort;

public class BubbleSortDemo {
    // 冒泡排序，a 表示数组，n 表示数组大小
    public static int[] bubbleSort(int[] a, int n) {
        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 3, 2, 1};
        int[] ints = BubbleSortDemo.bubbleSort(array, 6);
        for (int t :
                ints) {
            System.out.println(t);
        }
    }
}
