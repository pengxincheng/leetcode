package com.pxc.leetcode.easy.day20190505;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/5/5
 * @Time 16:23
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        new RemoveDuplicates().removeDuplicates(a);
    }
}
