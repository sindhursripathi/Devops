

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;



public class Register extends HttpServlet {
String name,pass,email,country;


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	name=request.getParameter("name");
	pass=request.getParameter("pass");
	email=request.getParameter("email");
	country=request.getParameter("country");
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sindhureddy","root","");
		Statement st=c.createStatement();
		int count=st.executeUpdate("insert into student values('"+name+"','"+pass+"','"+email+"','"+country+"')");
		out.println(count+"rows updated");
	}

	catch(Exception e)	
	{
	out.println(e);
	
	}
	}
}
