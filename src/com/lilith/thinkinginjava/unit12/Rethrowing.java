package com.lilith.thinkinginjava.unit12;
/**
 * P258	重新抛出异常
 * 如果使用printStackTrace()，只能原来异常的调用栈信息
 * 可以使用fillInStackTrace()获得包含了重新抛出点的信息的异常
 * @author Perform
 *
 */
public class Rethrowing {
	public static void f() throws Exception {
		System.out.println("originating the exception in f()");
		throw new Exception("f()");
	}
	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g().e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside h().e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("main:printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (Exception e) {
			System.out.println("main:printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}
