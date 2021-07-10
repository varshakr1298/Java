<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.io.*,java.util.*, javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set Session Data</title>
</head>
<body>
<%
String user=request.getParameter("userName");
out.print("Welcome! "+user);
session.setAttribute("user",user);
Integer c=0;
session.setAttribute("c",c);
%>
<a href="sesdata.jsp">Click here to get session data!</a>
</body>
</html>