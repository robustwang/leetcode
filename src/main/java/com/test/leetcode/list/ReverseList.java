package com.test.leetcode.list;

public class ReverseList {

    public static void main(String[] args) {
        int i = 10;
        int j = 8;
        int f = 10;
        int r = 6;
        int s = 6;
        int sr = i ^ j ^ f ^ r ^ s;
        System.out.println(sr);
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
