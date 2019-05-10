package com.pxc.leetcode.day20190505;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/5/5
 * @Time 17:10
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int length = nums.length;

        if (length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j += 1;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(new RemoveElement().removeElement(a, 2));
    }
}
