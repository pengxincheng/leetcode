package com.pxc.leetcode.day20190307;

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


        public static void main(String[] args) {
            ListNode n1 = new ListNode(1);
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
            System.out.println(res);
        }
    }


}
