package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("===Display from SecondServlet===");
		pw.println("<br>UserName:"+req.getParameter("uname"));
		pw.println("<br>MailId:"+req.getParameter("mid"));
	}
	
}
