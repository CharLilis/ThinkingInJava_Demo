package com.lilith.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lilith.entity.Emp;
/**
 * EL表达式Demo
 * @author Perform
 *
 */
public class ELDemoServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Emp emp = new Emp("One", "Dog", "OXO");
		
		//放入session
		HttpSession session = request.getSession();
		session.setAttribute("emp", emp);
		response.sendRedirect("jsp/ELDemo01.jsp");
	}
}
