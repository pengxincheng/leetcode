package com.pxc.leetcode;

/**
 * @author pengxincheng
 * @date 2023/6/26 10:27
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * <p>
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * <p>
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/sqrtx
 */
public class Question69 {

    public static void main(String[] args) {

        System.out.println(mySqrt(9));



    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        }
        int start = 0;
        int end = x;

        return calculate(start,end,x);
    }

    public static   int calculate(int start, int end, int x) {
        if (start >= end) {
            return start;
        }
        int mid = (start + end) / 2;

        long mid2 = (long) mid * mid;


        if (mid2 > x) {
            return calculate(start, mid, x);
        } else if (mid2 == x) {
            return mid;
        } else {
            long mid12 = (long) (mid + 1) * (mid + 1);
            if (mid12 > x) {
                return mid;
            }else {
                return calculate(mid + 1, end, x);
            }
        }
    }




}
