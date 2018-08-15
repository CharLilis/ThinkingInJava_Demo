package com.lilith.servlet.jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
/**
 * 自定义JSTL
 * @author Perform
 *
 */
public class DemoTag extends SimpleTagSupport{
	private String str;
	private int count;
	
	@Override
	public void doTag() throws JspException, IOException {
		PageContext page = (PageContext)getJspContext();
		JspWriter out =page.getOut();
		for(int i = 0; i < count; i++) {
			out.println(str + "<br/>");
		}
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
