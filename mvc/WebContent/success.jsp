<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"import="com.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Login l=(Login)request.getAttribute("Login");
out.println("Hi,"+l.getUsername()+"you are welcome");
%>

</body>
</html>