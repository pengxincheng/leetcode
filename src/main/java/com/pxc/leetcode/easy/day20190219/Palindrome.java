package com.pxc.leetcode.easy.day20190219;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/2/19
 * @Time 19:05
 *
 * 判断数字为回文数
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        int xx = x;

        if (x < 0) {
            return false;
        }

        int result = 0;
        while (x != 0) {
            int tmp = x % 10;
            x = x / 10;

            result = result * 10 + tmp;
        }
        return result == xx;
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome(123431));
    }
}
