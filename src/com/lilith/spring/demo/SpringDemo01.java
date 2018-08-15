package com.lilith.spring.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.HandlerMapping;

import com.lilith.spring.entity.ExampleBean;
import com.lilith.spring.entity.MassageBean;

public class SpringDemo01 {
	
	/**
	 * 测试自动注入
	 */
//	@Test
	public void testSpring() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		MassageBean massage = ac.getBean("massageBean", MassageBean.class);
		//测试spring的setter注入
		System.out.println(massage.getModuleName());
		System.out.println(massage.getPageSize());
		System.out.println(massage.getUsername());
		System.out.println(massage.getPassword());
		System.out.println(massage.getUsernames().toString());
		Map maps = massage.getMaps();
		Iterator<Map.Entry<String, String>> iter = maps.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> entry = iter.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		MassageBean massage2 = ac.getBean("massageBean2", MassageBean.class);
		//测试spring的构造器注入
		System.out.println(massage2.getModuleName());
		System.out.println(massage2.getPageSize());
		System.out.println(massage2.getUsername());
		System.out.println(massage2.getPassword());
	}
	
	/**
	 * 测试自动装配
	 */
//	@Test
	public void testSpring2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		ExampleBean example = ac.getBean("exampleBean", ExampleBean.class);
	}
	
	/**
	 * SpringMVC测试
	 */
	@Test
	public void testSpring3() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring02.xml");
		HandlerMapping map = ac.getBean("handlerMapping", HandlerMapping.class);
		System.out.println(map);
	}
	
}
