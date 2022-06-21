package com.pxc.leetcode.day20190306;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/3/6
 * @Time 18:55
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
public class longestCommonPrefixongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length > 1) {
            String firstStr = strs[0];
            char[] chars = firstStr.toCharArray();
            String prefix = "";
            for (int i = 0; i < chars.length; i++) {
                prefix = firstStr.substring(0, i + 1);
                boolean flag = false;
                for (int j = 1; j < strs.length; j++) {
                    if (!strs[j].startsWith(prefix)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    prefix = firstStr.substring(0, i);
                    break;
                }
            }
            return prefix;
        } else if (strs.length == 1) {
            return strs[0];
        } else {
            return "";
        }
    }


    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"dff","flow","flight"};
        System.out.println(new longestCommonPrefixongestCommonPrefix().longestCommonPrefix2(strs));

    }
}
