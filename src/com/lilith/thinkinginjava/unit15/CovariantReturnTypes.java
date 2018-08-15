package com.lilith.thinkinginjava.unit15;
/**
 * P407
 * 泛型-参数协变
 * @author 56580
 *
 */
public class CovariantReturnTypes {
	void test(DerivedGetter d) {
		Derived d2 = d.get();
	}
}
class Base{}
class Derived extends Base{}

interface OrdinaryGetter{
	Base get();
}

interface DerivedGetter extends OrdinaryGetter{
	Derived get();
}
