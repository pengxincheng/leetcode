package com.pxc.leetcode.sort;

import java.security.SecureRandom;

/**
 * @author pengxincheng
 * @date 2022/5/30 16:46
 */
public class Client {

    public static void main(String[] args) {
        int[] a = new int[1000000];
        int[] b = new int[1000000];
        int[] c = new int[1000];

        int[] d = {1, 4, 3, 2, 8, 5, 6, 4, 8, 9, 7,5,2,1,4};

        for (int i = 0; i < a.length; i++) {
            int x = new SecureRandom().nextInt(1000);
            a[i] = x;
            b[i] = x;
          //  c[i] = x;
        }

        long end = System.currentTimeMillis();
        long start = System.currentTimeMillis();

       /* new BubbleSort().bubbleSort(a);
        end = System.currentTimeMillis();
        System.out.println("BubbleSort 耗时：" + (end - start));*/

      /*  start = System.currentTimeMillis();
        new InsertionSort().insertionSort(b);
        end = System.currentTimeMillis();
        System.out.println("InsertionSort 耗时：" + (end - start));*/

/*
        start = System.currentTimeMillis();
        new SelectionSort().selectionSort(b);
        end = System.currentTimeMillis();
        System.out.println("SelectionSort 耗时：" + (end - start));*/


        start = System.currentTimeMillis();
        new MergeSort().mergeSort(b);
        end = System.currentTimeMillis();
        System.out.println("MergeSort 耗时：" + (end - start));


        start = System.currentTimeMillis();
        new QuickSortV2().quickSort(a);
        end = System.currentTimeMillis();
        System.out.println("QuickSortV2 耗时：" + (end - start));

        for (int i = 0; i < 50; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
