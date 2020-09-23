<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/6/1
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Userregistration.Userregistration" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="yonghu.css">
</head>
<body>

    <%
        Connection conn = Userregistration.getConn();
        Statement stmt = conn.createStatement();
        String sql = "select * from yh where true";
        ResultSet rs = stmt.executeQuery(sql);

    %>
    <div id="box1">
        <div id="box3"><P>用户信息注册</P></div>
        <div id="box2">
    <table id="table">
        <tr>
            <th colspan="2">注册系统</th>
        </tr>
        <tr>
            <th>用户名</th>
            <th>密码</th>
        </tr>
        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%=rs.getString("xm")%>
            </td>
            <td><%=rs.getString("password")%>
            </td>
        </tr>
        <%}%>
    </table>
        </div>
        <div id="box4"><P>4181174028</P><br><p>夏玉虎</p></div>
    </div>
</body>
</body>
</html>
