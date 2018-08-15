package com.lilith.thinkinginjava.unit10;

import com.lilith.tool.Print;
/**
 * P206	闭包与回调
 * 展现了外围类实现接口与内部类实现接口的之间的区别
 * @author 56580
 *
 */
public class Callbacks {
	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.incrementable());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}
interface Incrementable{
	void increment();
}
/**
 * 外围类实现接口很简单
 * @author 56580
 *
 */
class Callee1 implements Incrementable{
	private int i = 0;
	@Override
	public void increment() {
		i++;
		Print.println(i);
	}
}
class MyIncrement{
	public void increment() {
		Print.println("Other operation");
	}
	static void f(MyIncrement mi) {
		mi.increment();
	}
}
/**
 * 通过内部类实现接口
 * @author 56580
 *
 */
class Callee2 extends MyIncrement{
	private int i = 0;
	@Override
	public void increment() {
		super.increment();
		i++;
		Print.println(i);
	}
	/**
	 * 闭包
	 * 对于一个可调用的对象，包含了创建它的作用域的信息
	 * @author 56580
	 *
	 */
	private class Closure implements Incrementable{
		public void increment() {
			//回调
			//在此获得了外部类对象的引用
			Callee2.this.increment();
		}
	}
	public Incrementable incrementable() {
		return new Closure();
	}
}
/**
 * 调用者
 * @author 56580
 *
 */
class Caller{
	private Incrementable incrementable;
	Caller(Incrementable incrementable){
		this.incrementable = incrementable;
	}
	void go() {
		incrementable.increment();
	}
}
