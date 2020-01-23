<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String first,last,user,pass,address,contact;
first=request.getParameter("first_name");
last=request.getParameter("last_name");
user=request.getParameter("username");
pass=request.getParameter("password");
address=request.getParameter("address");
contact=request.getParameter("contact");

out.println("firstname"+first+"lastname"+last);
out.println("username"+user+"password"+pass);
out.println("address"+address+"contact"+contact);

if(user.equals("sindhu") && pass.equals("123"))
{
	session.setAttribute("User",user);
	out.println("<a href='jsp2.jsp'>Click</a>");
	
}
	//sponse.sendRedirect("jsp2.jsp?User="+user);
else
	response.sendRedirect("Home.html");



%>

</form>
</body>
</html>