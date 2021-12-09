package com.pxc.geek.algo.chapter08;

/**
 * @author pengxincheng
 * @date 2021/10/25 4:59 下午
 */
public class ArrayStack {

    /**
     * 栈大小
     */
    private Integer size;

    /**
     * 数组
     */
    private Integer [] array;

    /**
     * 元素个数
     */
    private Integer count;


    public ArrayStack(Integer size) {
        this.size = size;
        this.count = 0;
        array = new Integer[size];
    }

    public void push(Integer a) {
        if (count >= size) {
            throw new RuntimeException("超出栈大小");
        }

        array[count] = a;
        count ++;
    }

    public Integer pop() {
        if(count <=0){
            return 0;
        }
        Integer res = array[count - 1];
        array[count - 1] = null;
        count--;
        return res;
    }


    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);

        for (int i = 0; i < arrayStack.size; i++) {
            System.out.println(arrayStack.pop());
        }

    }
}
