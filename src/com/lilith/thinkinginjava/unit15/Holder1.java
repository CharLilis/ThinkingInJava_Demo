package com.lilith.thinkinginjava.unit15;
/**
 * P353
 * 持有对象
 * @author Perform
 *
 */
public class Holder1 {
	private Automobile a;
	public Holder1(Automobile a) {
		this.a = a;
	}
	Automobile get() {
		return a;
	}
}
class Automobile{}
