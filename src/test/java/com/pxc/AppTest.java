package com.pxc;

import org.openjdk.jol.info.ClassLayout;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static Object  o;


    public static void main(String[] args) {
        o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        System.out.println("- - - - - -加锁后- - - - - - - ");
        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
