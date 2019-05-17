package com.pxc.leetcode.easy;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/5/16
 * @Time 17:53
 */
public class Title35 {

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * <p>
     * 你可以假设数组中无重复元素。
     */

    public int searchInsert(int[] nums, int target) {

        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        for (int i = 0; i < length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (target < nums[i]) {
              if(i==0){
                  return 0;
              }else {
                  return i;
              }
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        System.out.println(new Title35().searchInsert(a,2));
    }
}
