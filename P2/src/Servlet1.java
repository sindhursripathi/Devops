import java.io.*;
import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.*;



public class Servlet1 extends HttpServlet {
String name;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
		name=request.getParameter("username");
	HttpSession session=request.getSession();
	session.setAttribute("User", name);
	out.println("<a href='Servlet2.java'>Click</a>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
