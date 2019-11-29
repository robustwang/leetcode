package com.test.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class ZongshuDemo {

    public static int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }
            if (count > majorityCount) {
                return num;
            }
        }

        return -1;
    }

    public static Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        int testArray[] = {1, 3, 3, 4, 5, 3, 3, 7, 3};
        int i = ZongshuDemo.majorityElement(testArray);
        Map<Integer, Integer> integerIntegerMap = ZongshuDemo.countNums(testArray);
        System.out.println(integerIntegerMap.size());
        System.out.println(i);
    }
}
