package com.pxc.leetcode.easy;

import java.util.Arrays;

/**
 * @Auther: pengxincheng
 * @Date: 2019/9/10 16:50
 * @Description:
 */
public class Question66 {

    public int[] plusOne(int[] digits) {
        boolean isAddOne = true;
        int[] result = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (isAddOne) {
                digits[i] += 1;
                if (digits[i] >= 10) {
                    isAddOne = true;
                    digits[i] -= 10;
                } else {
                    isAddOne = false;
                }
            }
            result[i + 1] = digits[i];
        }
        if (isAddOne) {
            result[0] = 1;
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] a = new int[]{9, 9, 9, 9};
       int[] res=  new Question66().plusOne(a);
        Arrays.stream(res).forEach(value -> System.out.println(value));
    }
}
