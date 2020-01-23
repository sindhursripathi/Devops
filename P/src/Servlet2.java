

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet2 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println(request.getParameter("user")+"you are in the page"+getServletConfig().getServletName());
		/*ServletContext sc=getServletContext();
		out.println("Mobile"+sc.getInitParameter("Email"));*/
	}

}
