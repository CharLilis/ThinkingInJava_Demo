package com.lilith.thinkinginjava.unit14;

import static com.lilith.tool.Print.*;
/**
 * P347
 * 
 * @author Perform
 *
 */
public class HiddenC {
	public static A makeA() {
		return new C();
	}
}
class C implements A{
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
	
	private void o(String c) {
		println("private C.o(" + c + ")");
	}
}
