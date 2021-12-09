package com.pxc.geek.algo.chapter07;

import com.pxc.leetcode.easy.day20190307.ListNode;
import org.junit.Test;

import java.util.Objects;

/**
 * 数据结构算法
 *
 * @author pengxincheng
 * @date 2021/10/12 4:08 下午
 */
public class App {


    @Test
    public void testReserveNodeList() {
        Node head = Node.initNode();
        head = reserveNodeList(head);
        Node.print(head);
    }

    @Test
    public void testCheckCircle() {
        Node head = Node.initNode();
        System.out.println(checkCircle(head));
    }

    @Test
    public void testMergeNodes() {
        Node head1 = Node.initNode();
        Node head2 = Node.initNode2();


        Node.print(mergeNodes(head1, head2));
    }

    @Test
    public void testLastNnode() {
        Node head1 = Node.initNode();
        System.out.println(findLastNnode(head1, 4).getData());
    }

    @Test
    public void testFindMiddleNode(){
        Node head1 = Node.initNode();
        System.out.println(findMiddleNode(head1).getData());
    }


    /**
     * 链表反转
     */
    public static Node reserveNodeList(Node head) {
        Node current = head;

        // 定义一个为空的前置节点
        Node pre = null;
        while (current != null) {
            // 先获取到下一个
            Node next = current.getNext();

            // 当前节点的next设置为前序节点
            current.setNext(pre);

            // 前序节点设置为当前节点 为下次循环准备
            pre = current;

            // 遍历到下一个节点
            current = next;
        }
        return pre;
    }


    /**
     * 判断链表是否有环
     * 一个指针每次走一步 一个走两步 若相遇 就是有环
     *
     * @param head
     * @return
     */
    public static boolean checkCircle(Node head) {
        Node slow = head;
        if (slow == null || slow.getNext() == null) {
            return false;
        }
        Node fast = head.getNext();

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }


    /**
     * 合并两个有序链表
     *
     * @param node1
     * @param node2
     * @return
     */
    public Node mergeNodes(Node node1, Node node2) {
        // 定一个哨兵
        Node resultHead = new Node(0, null);

        // 结果链表的指针
        Node resultCurrent = resultHead;

        while (node1 != null && node2 != null) {
            if (node1.getData() < node2.getData()) {
                resultCurrent.setNext(node1);
                node1 = node1.getNext();
                resultCurrent = resultCurrent.getNext();
            } else {
                resultCurrent.setNext(node2);
                node2 = node2.getNext();
                resultCurrent = resultCurrent.getNext();
            }
        }

        // 任何一个为空后，因为原来有序可以直接合并了
        if (node1 == null) {
            resultCurrent.setNext(node2);
        } else {
            resultCurrent.setNext(node1);
        }

        return resultHead.getNext();
    }


    /**
     * 查找倒数第n个元素
     * 一个指针A先走n步，指针B再走。当A到最后一个节点是 B就是倒数第n个元素
     * @param head
     * @return
     */
    public Node findLastNnode(Node head, int n) {
        Node current = head;

        Node nNode = head;
        for (int i = 1; i < n; i++) {
            nNode = current.getNext();
            current = nNode;
        }

        Node lastN = null;

        while (nNode != null) {
            nNode = nNode.getNext();
            lastN = head;
            head = head.getNext();
        }
        return lastN;
    }

    public Node findMiddleNode(Node head) {
        Node p1 = head;
        Node p2 = head;

        while (p2!=null && p2.getNext() != null) {
            p1 = p1.getNext();
            p2 = p2.getNext().getNext();
        }

        return p1;
    }

}
