package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/first")
public class FirstServlet extends HttpServlet{
@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		String uName= req.getParameter("uname");
		String mId= req.getParameter("mid");
		res.sendRedirect
		("http://localhost:8082/WebApp2/second?uname="+uName+"&mid="+mId);
		
	}
}
