package com.pxc.leetcode.easy.day20190215;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/2/15
 * @Time 14:25
 * 1 两数之和
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (hashMap.containsKey(tmp)) {
                return new int[]{hashMap.get(tmp), i};
            }

            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("no");
    }

    public static void main(String[] args) {
        int a[] = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 18);
        System.out.println(a[0] + "---" + a[1]);
    }
}
