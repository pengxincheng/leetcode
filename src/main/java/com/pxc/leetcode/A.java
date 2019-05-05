package com.pxc.leetcode;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/4/24
 * @Time 9:21
 */
public class A {

    static {
        System.out.println("a的静态块");
    }

    public A() {
        System.out.println("a的构造方法");
    }


    public static void main(String[] args) {
        String s = " <Currencies ForgeMaterial1=\"777777777\" ForgeMaterial34=\"777777777\" ForgeMaterial3=\"777777777\" AscensionTicket=\"0\" />";
        System.out.println(replace(s,"ForgeMaterial3","8888888"));

    }

    public static String replace(String s, String key, String newVlaue) {

        StringBuffer stringBuffer = new StringBuffer();

        String arr[] = s.split(" ");
        for (String s1 : arr) {
            if(s1.contains("=") && s1.substring(0,s1.lastIndexOf("=")).equals(key)){
                s1 = key + "=" + "\"" + newVlaue + "\"";
            }
            stringBuffer.append(s1).append(" ");
        }
        return stringBuffer.toString();
    }
}
