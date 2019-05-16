package com.pxc.leetcode.easy.day20190219;

import java.util.HashMap;
import java.util.Map;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/2/19
 * @Time 19:39
 * 罗马数字转int   只需遍历(倒序)，若相邻左边大于右边相加  否则相减
 */
public class RomanToInt {


    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Integer a = 0;
        int result = 0;

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (map.get(arr[i]) < a) {
                result -= map.get(arr[i]);
            } else {
                result += map.get(arr[i]);
            }
            a = map.get(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("MCMXCIV"));


    }
}
