<%@ page import="DBConn.DBconn" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/5/29
  Time: 14:06
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
    String sql = "update cj set kcdh=?,cj=? where id=?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    String kcdh = request.getParameter("kcdh");
    String cj = request.getParameter("cj");
    String ii = request.getParameter("id");
    pstmt.setString(1, kcdh);
    pstmt.setString(2, cj);
    pstmt.setString(3, ii);
    pstmt.execute();
    response.sendRedirect("10-2.jsp");
%>
</body>
</html>
