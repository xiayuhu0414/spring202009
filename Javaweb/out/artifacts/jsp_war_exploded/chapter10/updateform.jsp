<%@ page import="DBConn.DBconn" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/5/29
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Connection conn = DBconn.getConn();
    String ii = request.getParameter("id");
    String sql="select * from cj where id='"+ii+"'";
    Statement stmt=conn.createStatement();
    ResultSet rs=stmt.executeQuery(sql);
    rs.next();
%>

<CENTER>
    <form action="updatedo.jsp">
        编号：<input type="text" name="id" value=<%=rs.getInt("id")%> readonly><br>
        学号：<input type="text" name="xh" value=<%=rs.getString("xh")%> readonly><br>
        课程代号：<input type="text" name="kcdh" value=<%=rs.getString("kcdh")%>><br>
        成绩：<input type="text" name="cj" value=<%=rs.getInt("cj")%>><br>
        <input type="submit" value="更新">
    </form>
</CENTER>
</body>
</html>
