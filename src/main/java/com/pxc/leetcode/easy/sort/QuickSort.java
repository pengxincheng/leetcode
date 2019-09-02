package com.pxc.leetcode.easy.sort;

/**
 * Created by pxc on 2019/7/30.
 */
public class QuickSort {
    public void quickSort(int arr[], int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int t;
        int tmp = arr[low];
        while (i < j) {
            while (tmp <= arr[j] && i < j) {
                j--;
            }
            while (tmp >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            arr[low] = arr[i];
            arr[i] = tmp;
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 8, 5, 6, 4, 8, 9, 7};
        new QuickSort().quickSort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
