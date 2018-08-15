package com.lilith.thinkinginjava.unit14;

import static com.lilith.tool.Print.*;
/**
 * P249
 * 接口与类型信息
 * 使用反射机制调无视修饰词调用方法
 * @author Perform
 *
 */
public class AnonymousImplementation {
	public static void main(String[] args) throws Exception {
		A a = AnonymousA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}
	
}
class AnonymousA{
	public static A makeA() {
		return new A() {
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
		};
	}
}
