<%@ page import="java.io.*" %>
<%@ page import="java.lang.instrument.UnmodifiableClassException" %><%--
  Created by IntelliJ IDEA.
  User: huhu
  Date: 2020/5/10
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! int count = 1;%>
<%
    File f = new File("E:\\io\\count.txt");
    if (!f.exists()) {
        f.createNewFile();
    } else if (f.length() == 0) {
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(this.count);
        bw.flush();
        bw.close();
        fw.close();
    }
%>
<%
    if (session.isNew()) {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int num;
        while ((num = br.read()) != -1)
            count = num;
        br.close();
        fr.close();
        count++;
    }

%>
您的id：<%=session.getId()%><br>
您是第<%=count%>位访问者！<br>
计数文件保存地址:<%=f.getAbsolutePath()%><br>
文件名称:<%=f.getName()%>

<%
    FileWriter fw = new FileWriter(f);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(this.count);
    bw.flush();
    bw.close();
    fw.close();
%>
</body>
</html>
