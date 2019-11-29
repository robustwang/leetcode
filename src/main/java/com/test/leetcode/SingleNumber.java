package com.test.leetcode;

public class SingleNumber {


    public static void main(String[] args) {
        int[] array = {3,4,5,6,6,5,4,3,0};
        int i = SingleNumber.singleNumber(array);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums)
    {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
        {
            result ^= nums[i];
        }
        return result;
    }

}
