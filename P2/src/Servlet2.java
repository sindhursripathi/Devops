
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class Servlet2 extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out=response.getWriter();
		HttpSession se=request.getSession();
		out.println(se.getAttribute("User"));
		
	}

}
