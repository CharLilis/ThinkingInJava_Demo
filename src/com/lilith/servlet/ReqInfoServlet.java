package com.lilith.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqInfoServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse respense) throws ServletException, IOException {
		//获得所有消息头名称
		Enumeration e = request.getHeaderNames();
		while(e.hasMoreElements()) {
			String headName = e.nextElement().toString();
			System.out.println("消息头:" + headName + ":" + request.getHeader(headName));
		}
		System.out.println("请求方式："+request.getMethod());
		System.out.println("请求的协议种类："+request.getProtocol());
		System.out.println("请求资源如路径："+request.getRequestURI());
		System.out.println("请求的路径信息："+request.getRequestURL());
		System.out.println("请求的Servlet路径："+request.getServletPath());
		respense.setContentType("text/html;charset=UTF-8");
		Writer out = respense.getWriter();
		out.write("<h3>Hello，中文</h3>");
		out.close();
		
	}
}
