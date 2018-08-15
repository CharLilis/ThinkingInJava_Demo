package com.lilith.thinkinginjava.unit14;

import static com.lilith.tool.Print.*;
/**
 * P337
 * 代理的应用
 * @author Perform
 *
 */
public class SimpleProxyDemo {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonono");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}
interface Interface{
	void doSomething();
	void somethingElse(String arg);
}
class RealObject implements Interface{
	public void doSomething() {
		println("doSomething");
	}
	public void somethingElse(String arg) {
		println("somethingElse " + arg);
	}
}
class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied) {
		this.proxied = proxied;
	}
	public void doSomething() {
		println("SimpleProxy doSomething");
		proxied.doSomething();
	}
	public void somethingElse(String arg) {
		println("SimpleProxy domthingElse " + arg);
		proxied.somethingElse(arg);
	}
}
