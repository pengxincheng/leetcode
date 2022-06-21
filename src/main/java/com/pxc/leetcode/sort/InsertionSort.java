package com.pxc.leetcode.sort;

/**
 * @author pengxincheng
 * @date 2022/5/30 16:47
 */
public class InsertionSort {

    public void insertionSort(int[] a) {
        // 出始：未排序区间 1~n
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            int value = a[i];
            // 取第i个元素在已排序区间找它的位置 已排序区间从后往前比较
            for (; j >=0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                }else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }
}
