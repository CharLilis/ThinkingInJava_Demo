package com.lilith.thinkinginjava.unit08;

import com.lilith.tool.Print;
/**
 * P161	当一个对象同时被多个对象引用时，销毁方法应该在未被引用时调用
 * 		可以用引用计数的方法跟踪是否被引用
 * @author Perform
 *
 */
public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
		for(Composing c : composing) {
			c.dispose();
		}
	}
}
class Shared{
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		Print.println("Creating" + this);
	}
	
	public void addRef() {
		refcount++;
	}
	
	protected void dispose() {
		//没有引用时销毁对象
		if(--refcount == 0) {
			Print.println("Dispose " + this);
		}
	}
	@Override
	public String toString() {
		return "Shared " + id;
	}
}
class Composing{
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		Print.println("Creating" + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		Print.println("disposing " + this);
		shared.dispose();
	}
	public String toString() {
		return "Composing " + id;
	}
}
