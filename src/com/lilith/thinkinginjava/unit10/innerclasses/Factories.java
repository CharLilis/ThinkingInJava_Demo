package com.lilith.thinkinginjava.unit10.innerclasses;

import com.lilith.tool.Print;
/**
 * P200	匿名内部类在工厂方法中的使用
 * @author Perform
 *
 */
public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.factory();
		s.mothed1();
		s.mothed2();
	}
	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory());
		serviceConsumer(Implementation2.factory());
	}
}
interface Service{
	void mothed1();
	void mothed2();
}
interface ServiceFactory{
	Service factory();
}
class Implementation1 implements Service{
	private Implementation1() {}
	public void mothed1() {
		Print.println("Implementation1.mothed1");
	}
	public void mothed2() {
		Print.println("Implementation1.mothed2");
	}
	public static ServiceFactory factory() {
		return new ServiceFactory() {
			public Service factory() {
				return new Implementation1();
			}
		};
	}
}
class Implementation2 implements Service{
	private Implementation2() {}
	public void mothed1() {
		Print.println("Implementation2.mothed1");
	}
	public void mothed2() {
		Print.println("Implementation2.mothed2");
	}
	public static ServiceFactory factory() {
		return new ServiceFactory() {
			public Service factory() {
				return new Implementation2();
			}
		};
	}
}