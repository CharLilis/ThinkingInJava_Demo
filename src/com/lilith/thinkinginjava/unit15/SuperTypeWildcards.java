package com.lilith.thinkinginjava.unit15;

import java.util.List;
/**
 * P393
 * 通配符-逆变
 * @author Perform
 *
 */
public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples) {
		apples.add(new Apple());
		apples.add(new Jonathan());
//		apples.add(new Fruit());
	}
}
