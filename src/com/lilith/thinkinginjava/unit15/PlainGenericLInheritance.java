package com.lilith.thinkinginjava.unit15;
/**
 * P409
 * 泛型-参数协变
 * @author 56580
 *
 */
public class PlainGenericLInheritance {
	public static void main(String[] args) {
		Base b = new Base();
		Derived d =new Derived();
		DerivedGS dg = new DerivedGS();
		dg.set(b);
		dg.set(d);
	}
}
class GenericSetter<T>{
	void set(T t){
		System.out.println("GenericSetter.set(Base)");
	}
}
class DerivedGS extends GenericSetter<Base>{
	void set(Derived d) {
		System.out.println("DerivedGS.set(Derived)");
	}
}
