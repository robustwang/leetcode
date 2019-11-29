package com.test.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDemo {


    public static void main(String[] args) {
        int testArray[] = {1, 3, 3, 4, 5, 3, 3, 7, 3};
        int[] ints = TwoSumDemo.twoSum(testArray, 6);
        System.out.println(ints[0] + " " + ints[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
