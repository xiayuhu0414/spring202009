<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/5/26
  Time: 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="DBConn.DBconn" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center><%
    Connection conn = DBconn.getConn();
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
    <form action="insertform.html">
        <input type="submit" value="学生信息注册">
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
        <%
            int x = 0;
            while (rs.next()) {
                x = rs.getInt("id");
        %>
        <tr>
            <td><%=rs.getInt("id")%>
            </td>
            <td><%=rs.getString("xh")%>
            </td>
            <td><%=rs.getString("kcdh")%>
            </td>
            <td><%=rs.getInt("cj")%>
            </td>
            <td><a href=deletedo.jsp?id=<%=x%>>删除</a></td>
            <td><a href=updateform.jsp?id=<%=x%>>修改</a></td>
        </tr>
        <%}%>
    </table>
</center>
</body>
</html>
