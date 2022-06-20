package com.pxc.leetcode.easy.sort;

/**
 * @author pengxincheng
 * @date 2022/5/30 16:46
 */
public class Client {

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3, 1, 8, 4, 5, 9, 4};
        // new BubbleSort().bubbleSort(a);

        new InsertionSort().insertionSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
