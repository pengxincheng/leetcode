package com.pxc.leetcode.easy.day20190307;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/3/7
 * @Time 15:12
 * 示例 1:
 * <p>
 * 输入: '()'
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: '()[]{}'
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: '(]'
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: '([)]'
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: '{[]}'
 * 输出: true
 */
public class Solution {

    private HashMap<Character, Character> mappings;

    public Solution() {
        this.mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put(']', '[');
        mappings.put('}', '{');
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        //如果是左括号压栈 如果是右括号看能否找到对应的左括号
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                Character top = stack.empty() ? '*' : stack.pop();
                if(!top.equals(mappings.get(c))){
                    return false;
                }

            } else {
                stack.push(c);
            }
        }
        return stack.empty();
}

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(([]){})"));


    }
}
