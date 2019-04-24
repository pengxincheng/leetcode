package com.pxc.leetcode;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/4/24
 * @Time 9:22
 */
public class B extends A{

    static {
        System.out.println("b的静态");
    }

    public B() {
        System.out.println("b的构造方法");
    }


    public static void main(String[] args) {
        //B b = new B();
        //System.out.println("///////////////////");
        A a = new B();
        //先执行父类的静态 再执行子类的静态  父类的构造 子类的构造
    }
}
