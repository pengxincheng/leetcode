package com.pxc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengxincheng
 * @date 2023/7/6 17:46
 *
 * 给你一个整数 finalSum 。请你将它拆分成若干个 互不相同 的正偶数之和，且拆分出来的正偶数数目 最多 。
 *
 * 比方说，给你 finalSum = 12 ，那么这些拆分是 符合要求 的（互不相同的正偶数且和为 finalSum）：(2 + 10) ，(2 + 4 + 6) 和 (4 + 8) 。它们中，(2 + 4 + 6) 包含最多数目的整数。注意 finalSum 不能拆分成 (2 + 2 + 4 + 4) ，因为拆分出来的整数必须互不相同。
 * 请你返回一个整数数组，表示将整数拆分成 最多 数目的正偶数数组。如果没有办法将 finalSum 进行拆分，请你返回一个 空 数组。你可以按 任意 顺序返回这些整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximum-split-of-positive-even-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question2178 {


    public static void main(String[] args) {
    //    System.out.println(new Question2178().maximumEvenSplit(12));


        Boolean b = null;

        if(b){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
    }


    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return res;
        }

        long num = 2;

        while (finalSum >= num){
            finalSum = finalSum - num;
            res.add(num);
            num += 2;
        }

        return res;
    }
}
