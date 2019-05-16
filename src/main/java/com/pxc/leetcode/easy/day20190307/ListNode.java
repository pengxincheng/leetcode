package com.pxc.leetcode.easy.day20190307;

import java.util.Arrays;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/3/12
 * @Time 17:33
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            // 类似归并排序中的合并过程
            ListNode dummyHead = new ListNode(0);
            ListNode cur = dummyHead;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    cur = cur.next;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    cur = cur.next;
                    l2 = l2.next;
                }
            }
            // 任一为空，直接连接另一条链表
            if (l1 == null) {
                cur.next = l2;
            } else {
                cur.next = l1;
            }
            return dummyHead.next;
        }


        public int[] mergeTwoArray(int[] a, int[] b) {
            if (a == null || a.length == 0) {
                return b;
            }
            if (b == null || b.length == 0) {
                return a;
            }

            int[] result = new int[a.length + b.length];
            int minLength = Math.min(a.length, b.length);

            int i = 0;
            int j = 0;
            int k = 0;

            while (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    result[k++] = a[i++];      //先取值 再加1
                } else {
                    result[k++] = b[j++];
                }
            }

            while (i < a.length) {
                result[k++] = a[i++];
            }

            while (j < b.length) {
                result[k++] = b[j++];
            }

            return result;

        }


        public static void main(String[] args) {
            /*ListNode n1 = new ListNode(1);
            ListNode n2 = new ListNode(2);
            ListNode n3 = new ListNode(4);

            n1.next = n2;
            n2.next = n3;

            ListNode m1 = new ListNode(1);
            ListNode m2 = new ListNode(3);
            ListNode m3 = new ListNode(4);

            m1.next = m2;
            m2.next = m3;

            ListNode res = new Solution().mergeTwoLists(n1, m1);
            System.out.println(res);*/


            int a[] = {1,3,5,7,10};
            int b[] = {2,4,6,8};
            int[] c = new Solution().mergeTwoArray(a,b);
            Arrays.stream(c).forEach(System.out::println);
        }
    }


}
