package com.pxc.leetcode.easy;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianshiTi {

    public static void mA() throws IOException {
        System.out.println("AAAA");
        throw new IOException("sdsd");
    }

    public static void mB(){
        try {
            mA();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>(Arrays.asList(1,2));
      add(list);
      list.forEach(l->{
          System.out.println(l);
      });
    }

    static void add(List<Integer> list){
        list.add(3);
        list= new ArrayList<>(Arrays.asList(4));
    }
}
