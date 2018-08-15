package com.lilith.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 测试自动装配
 * @author 
 *
 */
@Controller
@RequestMapping("/demo")
public class HelloController02 {
	
	public HelloController02() {
		System.out.println("------HelloController02实例化--------");
	}
	
	@RequestMapping("/hello.spring")
	public String execute() throws Exception{
		return "hello";
	}
}
