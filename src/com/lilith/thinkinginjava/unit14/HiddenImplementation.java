package com.lilith.thinkinginjava.unit14;

import java.lang.reflect.Method;
/**
 * P347
 * 
 * @author Perform
 *
 */
public class HiddenImplementation {
	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		if(a instanceof C) {
			C c = (C)a;
			c.g();
		}
		callHiddenMethod(a, "g");
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
		callHiddenMethodParams(a, "o", "hello");
	}
	/**
	 * 执行类的指定方法
	 * @param a
	 * @param methodName
	 * @throws Exception
	 */
	static void callHiddenMethod(Object a, String methodName) throws Exception {
		Method g= a.getClass().getDeclaredMethod(methodName);
		//取消安全检查
		g.setAccessible(true);
		g.invoke(a);
	}
	static <V> void callHiddenMethodParams(Object a, String methodName, V v) throws Exception {
		System.out.println(v.getClass());
		Method g= a.getClass().getDeclaredMethod(methodName, v.getClass());
		//取消安全检查
		g.setAccessible(true);
		g.invoke(a, v);
	}
}
