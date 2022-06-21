package com.pxc.leetcode.sort;

/**
 * @author pengxincheng
 * @date 2022/6/21 15:10
 */
public class MergeSort {

    public void mergeSort(int[] a) {
        int[] temp = new int[a.length];
        sort(a, 0, a.length - 1, temp);
    }

    public void sort(int[] a, int start, int end, int[] result) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(a, start, mid, result);
        sort(a, mid + 1, end, result);
        merge(a, start, mid, end, result);
    }

    public void merge(int[] a, int start, int mid, int end, int[] result) {
        // 左边数起始位置
        int leftStart = start;
        // 右边数组起始位置
        int rightStart = mid + 1;
        // 结果数组下标
        int resultIndex = start;

        while (leftStart <= mid && rightStart <= end) {
            if (a[leftStart] > a[rightStart]) {
                result[resultIndex] = a[rightStart];
                rightStart += 1;
            } else {
                result[resultIndex] = a[leftStart];
                leftStart += 1;
            }
            resultIndex += 1;
        }

        while (leftStart <= mid) {
            result[resultIndex] = a[leftStart];
            leftStart += 1;
            resultIndex += 1;
        }

        while (rightStart <= end) {
            result[resultIndex] = a[rightStart];
            rightStart += 1;
            resultIndex += 1;
        }

        for (resultIndex = start; resultIndex <= end; resultIndex++) {
            a[resultIndex] = result[resultIndex];
        }

    }
}
