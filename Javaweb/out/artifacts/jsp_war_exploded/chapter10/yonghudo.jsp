
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
    String ps = request.getParameter("password");
    pstmt.setString(1, xm);
    pstmt.setString(2, ps);
    pstmt.execute();
%>

</body>
</html>
