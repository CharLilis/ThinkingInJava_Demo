package com.lilith.thinkinginjava.unit15;
/**
 * P408
 * 泛型-参数协变
 * @author 56580
 *
 */
public class OrdinaryArguments {
	public static void main(String[] args) {
		Base b = new Base();
		Derived d = new Derived();
		DerivedSetter set = new DerivedSetter();
		//发生了重载
		set.set(b);
		set.set(d);
	}
}
class OrdinarySetter{
	void set(Base base) {
		System.out.println("OrdinarySetter.set(Base)");
	}
}
class DerivedSetter extends OrdinarySetter{
	/**
	 * 发生了重载
	 * @param derived
	 */
	void set(Derived derived) {
		System.out.println("DerivedSetter.set(Derived)");
	}
}
