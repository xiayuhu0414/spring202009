<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/5/26
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="DBConn.DBconn" %>
<%@ page import="java.sql.PreparedStatement" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Connection conn = DBconn.getConn();
    String sql = "insert into yh(xm,password) values(?,?)";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    String xm = request.getParameter("xm");
    String p = request.getParameter("password");
    pstmt.setString(1, xm);
    pstmt.setString(2, p);
    pstmt.execute();
    response.sendRedirect("yonghudo.jsp");
%>
</body>
</html>
