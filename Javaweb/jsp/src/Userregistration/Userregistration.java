package Userregistration;

import java.sql.*;

public class Userregistration {
    private static Connection conn = null;

    public static Connection getConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=gbk";
        String user = "root";
        String password = "123456";
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
