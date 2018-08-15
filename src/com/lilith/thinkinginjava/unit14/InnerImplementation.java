package com.lilith.thinkinginjava.unit14;

import static com.lilith.tool.Print.*;
/**
 * P348
 * 接口与类型信息
 * @author Perform
 *
 */
public class InnerImplementation {
	public static void main(String[] args) throws Exception {
		A a = InnerA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}
}
class InnerA{
	private static class C implements A{
		public void f() {
			println("public C.f()");
		}
		public void g() {
			println("public C.g()");
		}
		void u() {
			println("package C.u()");
		}
		protected void v() {
			println("protected C.v()");
		}
		private void w() {
			println("private C.w()");
		}
	}
	public static A makeA() {
		return new C();
	}
}
