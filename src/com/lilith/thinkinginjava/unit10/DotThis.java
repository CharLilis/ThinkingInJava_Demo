package com.lilith.thinkinginjava.unit10;
/**
 * P193	使用.this和.new
 * 在内部类对象中使用外部类.this可以获得外部类的对象引用
 * @author Perform
 *
 */
public class DotThis {
	public void f() {
		System.out.println("DotThis.f()");
	}
	public class Inner{
		public DotThis outClass() {
			return DotThis.this;
		}
	}
	public Inner getInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		DotThis d = new DotThis();
		DotThis.Inner i = d.getInner();
		i.outClass().f();
	}
}
