package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(" in init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("in destroy");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("in toGet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("in to post");
		String username=request.getParameter("uname");
		String password=request.getParameter("pwd").trim();
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		if(username.equals("admin")&& password.equals("admin123"))
		{
			pw.print("<html><body>"
					+ "<h2>"+username+" !"
					+"<br/>"
					+"Today's Date : "+LocalDate.now()
					+ "</h2>"
					+"</body></html>");
		}
		else {
			pw.print("<html><body>"
					+ "<h2>"
					+"incorrect username and password!<br/>"
					+ "<a href='index.html'>go to login page</a>"
					+ "</h2>"
					+"</body></html>");
			
		}
		
	}

}
