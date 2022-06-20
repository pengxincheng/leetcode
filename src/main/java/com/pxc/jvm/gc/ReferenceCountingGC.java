package com.pxc.jvm.gc;

import java.util.concurrent.TimeUnit;

/**
 * @author pengxincheng
 * @date 2021/12/9 4:40 下午
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;
    /**
     * 这个成员属性的唯一意义就是占点内存，以便能在GC日志中看清楚是否有回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;
        objA = null;
        objB = null;
// 假设在这行发生GC，objA和objB是否能被回收？

    }

    public static void main(String[] args) throws Exception{


     /*   while (true) {
            new ReferenceCountingGC();
        }*/

        new ReferenceCountingGC().testGC();

        System.gc();
        TimeUnit.SECONDS.sleep(10L);
    }
}
