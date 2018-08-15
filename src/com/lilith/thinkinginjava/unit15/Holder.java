package com.lilith.thinkinginjava.unit15;
/**
 * P292
 * 通配符-编译器有多“聪明”
 * @author 56580
 *
 * @param <T>
 */
public class Holder<T> {
	private T val;
	public Holder() {}
	public Holder(T val) {
		this.val = val;
	}
	public void set(T val) {
		this.val = val;
	}
	public T get() {
		return val;
	}
	public boolean equals(Object obj) {
		return val.equals(obj);
	}
	public static void main(String[] args) {
		Holder<Apple> h = new Holder<Apple>(new Apple());
		Apple a = h.get();
		h.set(a);
		
//		Holder<Fruit> f = h;
//		Holder<Fruit> f = new Holder<Fruit>(new Apple());
		Holder<? extends Fruit> h2 = h;
		//通过get()huo'qu'y
		Fruit f = h2.get();
		Apple a1 = (Apple)h2.get();
		try {
			Orange o  = (Orange)h2.get();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(a.equals(a1));
		System.out.println(h2.equals(a1));
	}
}
