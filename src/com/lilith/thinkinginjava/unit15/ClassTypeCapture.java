package com.lilith.thinkinginjava.unit15;
/**
 * P380
 * 擦除的补偿
 * 泛型代码中会擦除掉类型信息，如果想要使用，就需要从外部传入
 * @author Perform
 *
 * @param <T>
 */
public class ClassTypeCapture<T> {
	Class<T> kind;
	public ClassTypeCapture(Class<T> type) {
		kind = type;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	public static void main(String[] args) {
		ClassTypeCapture<Building> cttl = 
				new ClassTypeCapture<Building>(Building.class);
		System.out.println(cttl.f(new Building()));
		System.out.println(cttl.f(new House()));
		ClassTypeCapture<House> cttl2 = 
				new ClassTypeCapture<House>(House.class);
		System.out.println(cttl2.f(new Building()));
		System.out.println(cttl2.f(new House()));
	}
}

class Building{}
class House extends Building{}