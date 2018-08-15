package com.lilith.thinkinginjava.unit14;
/**
 * P322
 * ClassName.class.cast(obj)
 * 新的转型方法
 * @author Perform
 *
 */
public class ClassCasts {
	public static void main(String[] args) {
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House)b;
		h = House.class.cast(b);
	}
}
class Building{}
class House extends Building{}
