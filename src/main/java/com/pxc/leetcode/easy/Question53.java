package com.pxc.leetcode.easy;

/**
 * @Author: pengxincheng
 * @Date: 2019/9/2 17:55
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class Question53 {

    public static void main(String[] args) {
        int a[] = {1, -1, 1};
        System.out.println(new Question53().maxSubArrayBest(a));
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int tmp = nums[i];
                for (int k = i + 1; k <= j; k++) {
                    tmp += nums[k];
                }
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    public int maxSubArrayBest(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            result = Math.max(sum, result);
        }
        return result;
    }

}
