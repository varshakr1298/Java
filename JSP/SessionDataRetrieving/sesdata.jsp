<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.io.*,java.util.*, javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session data</title>
</head>
<body>
<%
Date lastAccessTime=new Date(session.getLastAccessedTime());
String user=new String();
Integer c=0;
if(session.isNew()){
	session.setAttribute("user",user);
}else{
	c=(Integer)session.getAttribute("c");
	c=c+1;
	user=(String) session.getAttribute("user");
	session.setAttribute("c",c);
}
out.println("\nLast Accessed time: "+lastAccessTime);
out.println("\nUser: "+user);
out.println("\nVisit Count: "+c);
%>
</body>
</html>