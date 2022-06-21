package com.pxc.leetcode.day20190215;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/2/15
 * @Time 14:46
 * 题7 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *   -2147483648——2147483647
 */
public class Reverse {

    public int reverse(int x) {
        try {
            String tmp;
            StringBuffer sb = new StringBuffer();

            tmp = String.valueOf(x);
            char[] arr = tmp.toCharArray();

            if (x > 0) {
                for (int i = arr.length - 1; i >= 0; i--) {
                    sb.append(arr[i]);
                }
                return Integer.parseInt(sb.toString());
            } else if (x < 0) {
                sb.append(arr[0]);
                for (int i = arr.length - 1; i >= 1; i--) {
                    sb.append(arr[i]);
                }
                return Integer.parseInt(sb.toString());

            } else {
                return 0;
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }


    public int bestReverse(int x) {

        int result = 0;

        while (x != 0) {
            int tmp = x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && tmp > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && tmp < -8)) {
                return 0;
            }
            result = result * 10 + tmp;
        }

        return result;
    }


    public static void main(String[] args) {
        //System.out.println(new Reverse().reverse(1534236469));

        System.out.println(new Reverse().bestReverse(1463847412));

    }

}
