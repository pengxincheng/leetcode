package com.pxc.leetcode;

/**
 * @author pengxincheng@ipaynow.cn
 * @Date: 2019/4/24
 * @Time 9:22
 */
public class B extends A {

    static {
        System.out.println("b的静态");
    }

    public B() {
        System.out.println("b的构造方法");
    }


    public static void main(String[] args) {
        //B b = new B();
        //System.out.println("///////////////////");
        //A a = new B();
        //先执行父类的静态 再执行子类的静态  父类的构造 子类的构造

        System.out.println(sumI(100));
        System.out.println(f(5));
    }

    public static int sumI(int i) {
        if (i == 1) {
            return i;
        }

        return i + sumI(i - 1);
    }


    //F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)
    public static int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;


        return f(n - 1) + f(n - 2);

    }
}
