package day002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyPage implements Servlet{

	ServletConfig config =null;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException
	{
		this.config=arg0;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
       res.setContentType("text/html");
       PrintWriter out =res.getWriter();
       out.print("<html><body>hello</html></body>");
		
	}

}
