package com.pxc.leetcode.easy;

/**
 * @Author: pengxincheng
 * @Date: 2019/8/30 16:04
 * @Description:
 */
public class Question38 {

    public String countAndSay(int n) {
        String str = "1";
        if (n == 1) {
            return str;
        }
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for (int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if (pre == c) {
                    count++;
                } else {
                    sb.append(count).append(pre);
                    pre = c;
                    count = 1;
                }
            }
            sb.append(count).append(pre);
            str = sb.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new Question38().countAndSay(3));
    }
}
