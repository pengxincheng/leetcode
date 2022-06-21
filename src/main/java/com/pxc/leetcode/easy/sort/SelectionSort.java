package com.pxc.leetcode.easy.sort;

/**
 * @author pengxincheng
 * @date 2022/6/21 10:47
 */
public class SelectionSort {

    public void selectionSort(int[] a) {
        // 每次选择一个 需要执行n次
        for (int i = 0; i < a.length; i++) {
            int j = i;
            int minIndex = i;
            // 从未排序数组中找出最小的
            for (; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            //第i次操作就是要交换第i个元素  最小位置 和 a[i]交换
            int value = a[i];
            a[i] = a[minIndex] ;
            a[minIndex] = value;
        }
    }
}
