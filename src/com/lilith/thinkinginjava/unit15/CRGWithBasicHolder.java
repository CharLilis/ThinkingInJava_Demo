package com.lilith.thinkinginjava.unit15;
/**
 * P405
 * 泛型-自限定类型
 * @author Perform
 *
 */
public class CRGWithBasicHolder {
	public static void main(String[] args) {
		Subtype st1 = new Subtype(), st2 = new Subtype();
		st1.set(st2);
		Subtype st3 = st1.get();
		st1.f();
//		st3.f();st3中的element是null
	}
}
class Subtype extends BasicHolder<Subtype>{
	
}
