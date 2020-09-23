package DBConn;

import java.sql.*;

public class DBconn {
    private static Connection conn = null;

    public static Connection getConn() {
        //1.查找驱动程序包
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //out.println("查找成功！");
        //2.创建连接字符串：url,user,password
        String url = "jdbc:mysql://localhost:3306/mydata?useUnicode=true&characterEncoding=gbk";
        String user = "root";
        String password = "123456";
        //3.创建连接对象connection
        try {
           conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}