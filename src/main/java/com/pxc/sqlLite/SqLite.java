package com.pxc.sqlLite;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author pengxincheng
 * @date 2023/6/25 15:28
 */
public class SqLite {

    public static void main(String[] args) throws Exception{

        File tkFile = new File("/Users/pengxincheng/idea_workspace/leetcode/src/main/java/com/pxc/sqlLite/tk_file_615test2");

        byte[] arr = getBytesFromFile(tkFile);

        System.out.println(new String(arr, "UTF-8"));
    }

    /**
     * tk_file文件中读取内容
     *
     * @return
     */
    public static byte[] getBytesFromFile(File tk_file_db) {
        Connection c = null;
        Statement stmt = null;
        byte[] tk_file = null;
        try {
            String url = "jdbc:sqlite:" + tk_file_db.getAbsolutePath();
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection(url);
            c.createStatement().execute("PRAGMA encoding = 'UTF-8'");
            System.out.println("Opened database successfully");
            stmt = c.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM tk_file;");
            while (rs.next()) {
                int id = rs.getInt("ID");
                byte[] bytes = rs.getBytes("tk_file");
                String s = new String(bytes, StandardCharsets.UTF_8);
                System.out.println(s);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
        return tk_file;
    }

}
