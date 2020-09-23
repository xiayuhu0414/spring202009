<%--
  Created by IntelliJ IDEA.
  User: huhu
  Date: 2020/5/15
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>建立与数据库连接</title>
</head>
<body>
<center><%
    /*1.查找驱动程序包
    2.创建连接字符串：url,user,password
    3.创建连接对象connection
    4.创建操作SQL-select的statement对象
    5.用statement对象执行select语句，将结果保存到resultset对象中
    6.对记录结果resultset对对象进行遍历，输出到页面中  */
    //1.查找驱动程序包
    Class.forName("com.mysql.jdbc.Driver");
    //out.println("查找成功！");
    //2.创建连接字符串：url,user,password
    String url = "jdbc:mysql://localhost:3306/mydata?useUnicode=true&characterEncoding=gbk";
    String user = "root";
    String password = "123456";
    //3.创建连接对象connection
    Connection conn = DriverManager.getConnection(url, user, password);
    //out.println("连接成功！");
    //4.创建操作SQL-select的statement对象
    Statement stmt = conn.createStatement();
    // 5.用statement对象执行select语句，将结果保存到resultset对象中
    String sql = "select * from cj where true";
    String xh = request.getParameter("xh");
    if (xh != null && xh != "")
        sql = sql + " and xh='" + xh + "'";
    String kcdh = request.getParameter("kcdh");
    if (kcdh != null && kcdh != "")
        sql = sql + " and kcdh='" + kcdh + "'";
    System.out.println(sql);
    ResultSet rs = stmt.executeQuery(sql);

    //6.对记录结果resultset对对象进行遍历，输出到页面中
%>
    <form action="">
        学号：<input type="text" name="xh">
        课程代号：<select name="kcdh">
        <option value="01">01</option>
        <option value="02">02</option>
        <option value="03">03</option>
    </select><br>
        <input type="submit" value="查询">
    </form>
    <table border="0">
        <tr>
            <th colspan="4">学生管理系统</th>
        </tr>
        <tr>
            <th>编号</th>
            <th>学号</th>
            <th>课程代号</th>
            <th>成绩</th>
        </tr>
        <%while (rs.next()) {%>
        <tr>
            <td><%=rs.getInt("id")%>
            </td>
            <td><%=rs.getString("xh")%>
            </td>
            <td><%=rs.getString("kcdh")%>
            </td>
            <td><%=rs.getInt("cj")%>
            </td>
        </tr>
        <%}%>
    </table>
</center>
</body>
</html>
