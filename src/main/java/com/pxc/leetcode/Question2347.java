package com.pxc.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author pengxincheng
 * @date 2023/7/20 10:25
 *
 * 给你一个整数数组 ranks 和一个字符数组 suit 。你有 5 张扑克牌，第 i 张牌大小为 ranks[i] ，花色为 suits[i] 。
 *
 * 下述是从好到坏你可能持有的 手牌类型 ：
 *
 * "Flush"：同花，五张相同花色的扑克牌。
 * "Three of a Kind"：三条，有 3 张大小相同的扑克牌。
 * "Pair"：对子，两张大小一样的扑克牌。
 * "High Card"：高牌，五张大小互不相同的扑克牌。
 * 请你返回一个字符串，表示给定的 5 张牌中，你能组成的 最好手牌类型 。
 *
 * 注意：返回的字符串 大小写 需与题目描述相同。
 *
 *[2,10,7,10,7]
 * ["a","b","a","d","b"]
 *
 * [10,10,2,12,9]
 * ["a","b","c","a","d"]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/best-poker-hand
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question2347 {

    public static void main(String[] args) {

        int[] ranks = {10,10,2,12,9};
        char[] suit = {'a','b','c','a','d'};
        System.out.println(new Question2347().bestHand(ranks,suit));
    }


    public String bestHand(int[] ranks, char[] suits) {

        Map<Integer, Integer> map = new HashMap<>();

        boolean isFlush = true;
        char a = suits[0];
        for (int i = 0; i < suits.length; i++) {
            if(!Objects.equals(a,suits[i])){
               isFlush = false;
            }

            if(map.containsKey(ranks[i])){
              map.put(ranks[i],map.get(ranks[i])+1);
            }else {
                map.put(ranks[i],1);
            }
        }
        if(isFlush){
            return "Flush";
        }

        int max = map.entrySet().stream().map(Map.Entry::getValue).max(Integer::compare).orElse(0);

        if(max >= 3){
            return "Three of a Kind";
        }else if(max == 2){
            return "Pair";
        }else{
            return "High Card";
        }
    }
}
