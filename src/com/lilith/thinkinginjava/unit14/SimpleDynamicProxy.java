package com.lilith.thinkinginjava.unit14;

import java.lang.reflect.*;
/**
 * P339
 * 本地动态代理
 * @author 56580
 *
 */
public class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface)Proxy.newProxyInstance(
				Interface.class.getClassLoader(), 
				new Class[] {Interface.class}, 
//				new DynamicProxyHandler(real)
				//使用匿名内部类实现
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("**** proxy: " + proxy.getClass() + ",method: " + method + ",args: " + args);
						if(args != null) {
							for(Object arg : args) {
								System.out.println(" " + arg);
							}
						}
						return method.invoke(real, args);
					}
				});
		consumer(proxy);
	}
}
class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("**** proxy: " + proxy.getClass() + ",method: " + method + ",args: " + args);
		if(args != null) {
			for(Object arg : args) {
				System.out.println(" " + arg);
			}
		}
		return method.invoke(proxied, args);
	}
	
}
