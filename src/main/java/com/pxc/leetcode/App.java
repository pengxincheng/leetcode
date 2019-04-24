package com.pxc.leetcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        String oldPath = "/opt/test/test2/test.txt";
        String newPath = "/opt/test/test3/test.txt";

        copyFile(oldPath,newPath);


    }

    public static void copyFile(String oldPath, String newPath) {
        try {
            String filePath = newPath.substring(0,newPath.lastIndexOf("/")+1);
            int bytesum = 0;
            int byteread = 0;
            File oldfile = new File(oldPath);
            File newFile = new File(filePath);
            if (oldfile.exists()) { //文件存在时
                InputStream inStream = new FileInputStream(oldPath); //读入原文件

                if(!newFile.exists()){
                    newFile.mkdirs();
                }
                FileOutputStream fs = new FileOutputStream(newPath);

                byte[] buffer = new byte[1444];
                int length;
                while ( (byteread = inStream.read(buffer)) != -1) {
                    bytesum += byteread; //字节数 文件大小
                    System.out.println(bytesum);
                    fs.write(buffer, 0, byteread);
                }
                inStream.close();
            }
        }
        catch (Exception e) {
            System.out.println("复制单个文件操作出错");
            e.printStackTrace();

        }

    }

}
