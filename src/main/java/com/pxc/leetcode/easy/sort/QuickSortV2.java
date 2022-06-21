package com.pxc.leetcode.easy.sort;

/**
 * @author pengxincheng
 * @date 2022/6/21 16:46
 */
public class QuickSortV2 {

    public void quickSort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    public void sort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }
        // 分区找到分界点的下标
        int q = partition(a, start, end);
        sort(a, start, q - 1);
        sort(a, q + 1, end);
    }

    private int partition(int[] a, int start, int end) {
        // 从start 到i 为已处理区间，即每次去一个数，跟pivot对比，若小于pivot,放入已处理区间
        // i-1 代表已处理区最后元素的下标
        int i = start;
        int pivot = a[end];
        for (int j = start; j < end ; j++) {
            if (a[j] < pivot) {
                // 小于，则需要把 a[j] 放在已处理区末尾就可以了 即a[i]
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i += 1;
            }
        }

        // 处理完了 交换a[i] 和 a[end]即 将pivot放到两个区域中间
        a[end] = a[i];
        a[i] = pivot;
        return i;
    }
}
