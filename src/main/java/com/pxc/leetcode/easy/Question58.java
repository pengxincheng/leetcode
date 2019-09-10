package com.pxc.leetcode.easy;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther: pengxincheng
 * @Date: 2019/9/10 12:11
 * @Description: 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 */
public class Question58 {

    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new Question58().lengthOfLastWord("Hello World"));
        ;
    }
}
