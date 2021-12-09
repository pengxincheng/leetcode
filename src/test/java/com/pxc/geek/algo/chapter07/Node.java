package com.pxc.geek.algo.chapter07;

/**
 * @author pengxincheng
 * @date 2021/10/12 4:21 下午
 */
public class Node {

    private int data;
    private Node next;


    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    /**
     * 构建并返回头
     * @return
     */
    public static Node initNode(){
        Node node1= new Node(1,null);
        Node node2= new Node(2,null);
        Node node3= new Node(3,null);
        Node node4= new Node(4,null);



        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

       // node5.next = node1;
        return node1;
    }

    /**
     * 构建并返回头
     * @return
     */
    public static Node initNode2(){
        Node node1= new Node(0,null);
        Node node2= new Node(2,null);
        Node node3= new Node(4,null);
        Node node4= new Node(6,null);
        Node node5= new Node(8,null);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // node5.next = node1;
        return node1;
    }



    public static void print(Node head){
        while (head!= null){
            System.out.println(head.getData());
            head = head.next;
        }
    }

}
