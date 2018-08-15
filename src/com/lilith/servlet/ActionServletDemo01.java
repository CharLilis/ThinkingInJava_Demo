package com.lilith.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ActionServletDemo01 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());//具体资源路径
		System.out.println(request.getRequestURL());//完整请求路径
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String uri = request.getRequestURI();
		String actionPath = uri.substring(uri.lastIndexOf("/")+1, uri.indexOf("."));
		
		HttpSession session = request.getSession();
		if("login".equals(actionPath)) {
			String name = request.getParameter("username");
			String password = request.getParameter("password");
			String validata = request.getParameter("validata");
			
			String validataOfSession = session.getAttribute("validata").toString();
			
			if("11".equals(name) && "11".equals(password) && validataOfSession.equals(validata)) {
				session.setAttribute("name", name);
				response.sendRedirect("index.jsp");
			}else {
				session.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else if("logout".equals(actionPath)) {
			session.invalidate();
			response.sendRedirect("index.jsp");
		}
	}
}
