package com.cg.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.login.bean.LoginBean;
import com.cg.login.exception.LoginException;
import com.cg.login.service.ILoginService;
import com.cg.login.service.LoginServiceimpl;

@WebServlet("/Saisowmya")
public class Saisowmya extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Saisowmya() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String username=request.getParameter("uname").trim();
		String password=request.getParameter("pwd").trim();
		ILoginService service=new LoginServiceimpl();
		LoginBean loginBean=new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);
		if (service.validate(loginBean)) {
			try {
				if (service.verifyLogin(loginBean)) {
					HttpSession httpSession=request.getSession();
					httpSession.setAttribute("username",username);
					request.getRequestDispatcher("inbox.jsp").include(request, response);
					
				} else {
					request.setAttribute("errmsg", "invalid username and password");
					request.getRequestDispatcher("error.jsp").include(request, response);

				}
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				request.setAttribute("errmsg", e.getMessage());
				e.printStackTrace();
			}
		} else {
			request.setAttribute("errmsg", "invalid username and password");
			request.getRequestDispatcher("error.jsp").include(request, response);

		}
	}

}
