package com.lilith.thinkinginjava.unit12;
/**
 * P258	可以从捕获的异常中获得的信息
 * 可以获得方法名
 * @author Perform
 *
 */
public class WhoCalled {
	static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			for(StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
				System.out.println(ste);
			}
		}
	}
	static void g() {f();}
	static void h() {g();}
	public static void main(String[] args) {
		f();
		System.out.println("----------------");
		g();
		System.out.println("----------------");
		h();
	}
	
}
