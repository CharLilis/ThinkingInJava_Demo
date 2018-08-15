package com.lilith.thinkinginjava.unit15;
/**
 * P367
 * 泛型擦除
 * @author Perform
 *
 */
public class ErasureAndInheritance {
	//关闭警告
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		Object obj =d2.get();
		d2.set(obj);
	}
}
class GenericBase<T>{
	private T element;
	public void set(T arg) {
		element = arg;
	}
	public T get() {
		return element;
	}
}
class Derived1<T> extends GenericBase<T>{}
class Derived2 extends GenericBase{}
//泛型期望得到一个原生基类
//class Derived3 extends GenericBase<?>{}
