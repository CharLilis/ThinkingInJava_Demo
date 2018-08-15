package com.lilith.thinkinginjava.unit15;
/**
 * P408
 * 泛型-参数协变
 * @author 56580
 *
 */
public class GenericsAndReturnTypes {
	void test(Getter g) {
		Getter get = g.get();
		GenericGetter gg = g.get();
	}
}

interface GenericGetter<T extends GenericGetter<T>>{
	T get();
}

interface Getter extends GenericGetter<Getter>{}
