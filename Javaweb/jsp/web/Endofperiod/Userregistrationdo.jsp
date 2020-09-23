<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/6/1
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Userregistration.Userregistration" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Connection conn = Userregistration.getConn();
    String sql = "insert into yh(xm,password) values(?,?)";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    String xm = request.getParameter("xm");
    String ps = request.getParameter("password");
    pstmt.setString(1, xm);
    pstmt.setString(2, ps);
    pstmt.execute();
    response.sendRedirect("Userregistration.jsp");
%>
</body>
</html>
