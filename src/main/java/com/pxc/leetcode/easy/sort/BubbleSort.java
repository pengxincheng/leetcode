package com.pxc.leetcode.easy.sort;

/**
 * @author pengxincheng
 * @date 2022/5/30 15:58
 */
public class BubbleSort {

    public void bubbleSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        // 结束冒泡标识
        boolean flag = false;

        // 需要进行n次冒泡
        for (int i = 0; i < array.length; i++) {
            // 每次冒泡确定一个元素的位置。 索引第i次冒泡需要从 0比较到 length-i-1的地府
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }
}
