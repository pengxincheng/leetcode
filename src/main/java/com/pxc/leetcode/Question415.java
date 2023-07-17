package com.pxc.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pengxincheng
 * @date 2023/7/17 13:42
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
 *
 * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 123456
 *   9876
 */
public class Question415 {

    public static void main(String[] args) {
        String num1 ="999";
        String num2 = "1";

        System.out.println(new Question415().addStrings(num1,num2));
    }


    public String addStrings(String num1, String num2) {
        char[] char1Arr; //长
        char[] char2Arr; //短

        if (num2.length() > num1.length()) {
            char1Arr = num2.toCharArray();
            char2Arr = num1.toCharArray();
        } else {
            char1Arr = num1.toCharArray();
            char2Arr = num2.toCharArray();
        }

        StringBuffer sb = new StringBuffer();
        int jin = 0;
        int j = char2Arr.length - 1;

        for (int i = char1Arr.length - 1; i >= 0; i--) {

            Integer a = Character.getNumericValue(char1Arr[i]);
            Integer b = 0;
            if (j >= 0) {
                b = Character.getNumericValue(char2Arr[j]);
            }

            Integer c = a + b + jin;

            jin = c / 10;
            sb.append(c % 10);
            j--;
        }

        if (jin != 0) {
            sb.append(jin);
        }

        return sb.reverse().toString();
    }
}
