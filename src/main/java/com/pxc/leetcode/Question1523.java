package com.pxc.leetcode;

/**
 * @author pengxincheng
 * @date 2023/7/21 16:01
 */
public class Question1523 {

    public static void main(String[] args) {
        System.out.println(new Question1523().countOdds(20,24));
    }

    public int countOdds(int low, int high) {
        if (low % 2 != 0  && high % 2 != 0) {
            return (high - low + 1) / 2 +1;
        } else if (low % 2 == 0 && high % 2 == 0) {
            return (high - low + 1) / 2;

        }else {
            return (high - low +1) / 2;
        }

    }
}
