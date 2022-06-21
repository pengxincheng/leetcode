package com.pxc.leetcode;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/5/10
 * @Time 15:49
 */
public class Title28 {

    public int strStr(String haystack, String needle) {

        if(null== haystack || needle == null){
            return -1;
        }else if(haystack=="" || needle==""){
            return 0;
        }else {
           return haystack.indexOf(needle);
        }
    }

    public static void main(String[] args) {
        System.out.println(  new Title28().strStr("aaaaaaa","bba"));
    }
}
