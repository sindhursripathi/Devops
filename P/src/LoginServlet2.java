import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;



public class LoginServlet2 extends HttpServlet {
	String user,pass;
	public void init()
	{
		System.out.println("inside method");
		
	}
	public LoginServlet2()
	{
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		out.println("Username"+user+""+"password"+"pass");
		if(user.equals("sindhu") && pass.contentEquals("sindhu123"))
			
		{
			RequestDispatcher rd=request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
			/*out.println("Hello"+user+"welcome to this site");
			out.println("Mobile"+getServletContext().getInitParameter("Email"));*/
			
		}
		else`
		{
			out.println("fail");
		}
	}
		public void destroy()
		{
			System.out.println("inside destroy method");
			
		}
	

}

