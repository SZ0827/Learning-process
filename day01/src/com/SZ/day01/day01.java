package com.SZ.day01;

import java.util.Arrays;

public class day01 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        ListNode l1 = node1;
        ListNode l2 = new ListNode(9);
        int nums[] = {2, 7, 11, 15};
       day01 day01 = new day01();//创建实例来调用非静态方法
        ListNode l3=day01.addTwoNumbers(l1,l2);
        printListNode(l1);
        printListNode(l2);
        printListNode(l3);
        int[] result = day01.twosum(nums, 18);
        System.out.println(Arrays.toString(result));}




    /*在数组中找出两个数，使得它们的和等于目标值。
    返回这两个数的索引。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍*/
        public  int[] twosum(int nums[], int target){
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
//        创建一个链表节点类
        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val){this.val = val;}
            ListNode(int val, ListNode next){this.val = val; this.next = next;}
        }
//      输出链表
    public static void printListNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
//    两个链表相加超过10向前进位
        public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
            ListNode head = null, tail = null;
            int carry = 0;
            while (l1 != null || l2 != null) {
//                每次遍历，不为空去当前值，为空取0
                int n1 = l1 != null ? l1.val : 0;
                int n2 = l2 != null ? l2.val : 0;
                int sum = n1 + n2 + carry;
                if (head == null) {
                    head = tail = new ListNode(sum % 10);
                } else {
                    tail.next = new ListNode(sum % 10);
                    tail = tail.next;
                }
                carry = sum / 10;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if (carry > 0) {
                tail.next = new ListNode(carry);
            }
            return head;
        }

    }
