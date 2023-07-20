package com.pxc.leetcode;

/**
 * @author pengxincheng
 * @date 2023/7/18 18:24
 *
 * 给定长度为 2n 的整数数组 nums ，你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到 n 的 min(ai, bi) 总和最大。
 *
 * 返回该 最大总和 。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/array-partition
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 直接用Array.sort就行
 */
public class Question561 {

    public static void main(String[] args) {

        int[] arr = {6214, -2290, 2833, -7908};

        System.out.println(new Question561().arrayPairSum(arr));
    }
    public int arrayPairSum(int[] nums) {

        int result = 0;

        for (int j = 0; j < nums.length / 2; j++) {

            int max1 = Integer.MIN_VALUE; //最大
            int max2 = Integer.MIN_VALUE; //二大

            int idx = 0;
            for (int i = 0; i < nums.length; i++) {
                if (max1 < nums[i]) {
                    max1 = nums[i];
                    idx = i;
                }
            }
            nums[idx] = Integer.MIN_VALUE;

            idx = 0;
            for (int i = 0; i < nums.length; i++) {
                if (max2 < nums[i]) {
                    max2 = nums[i];
                    idx = i;
                }
            }
            nums[idx] = Integer.MIN_VALUE;

            result += max2;

        }
        return result;
    }
}
