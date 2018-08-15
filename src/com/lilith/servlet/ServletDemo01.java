package com.lilith.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo01 extends HttpServlet{
	public ServletDemo01() {
		System.out.println("servlet实例化......");
	}
	@Override
	public void init() throws ServletException {
		ServletConfig servletConfig = getServletConfig();
		String city = servletConfig.getInitParameter("city");
		System.out.println("得到初始化参数city=" + city);
		System.out.println("servlet初始化......");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servlet就绪........");

		ServletContext servletContext = getServletContext();
		String count = (String)servletContext.getAttribute("count");
		if(count == null) {
			count = "0";
		}
		count = Integer.toString(Integer.parseInt(count)+1);
		if(Integer.parseInt(count) == 10) {
			servletContext.removeAttribute("count");
		}else {
			servletContext.setAttribute("count", count);
		}
		
		response.setContentType("text/html;charset=UTF-8");
		Writer out = response.getWriter();
		out.write("第" + count + "次访问");
		out.close();
		
		if("11".equals(count)) {
			System.out.println("测试重定向");
			response.sendRedirect("http://www.lilith.com");
		}
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("servlet销毁.............");
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.parseInt(null));
	}
}
