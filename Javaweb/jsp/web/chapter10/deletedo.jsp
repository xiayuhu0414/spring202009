<%@ page import="DBConn.DBconn" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/5/29
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    Connection conn = DBconn.getConn();
    String sql = "delete from cj where id=?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    String ii = request.getParameter("id");
    pstmt.setString(1, ii);
    pstmt.execute();
    response.sendRedirect("10-2.jsp");
%>
</body>
</html>
