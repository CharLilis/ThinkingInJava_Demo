package com.lilith.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logon01Servlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String qq = request.getParameter("QQ");
		String name = request.getParameter("Name");
		System.out.println("QQ:"+qq+";Name:"+name);
		response.setContentType("text/html;charset=UTF-8");
		Writer out = response.getWriter();
		out.write("欢迎"+qq);
		out.close();
	}
}
