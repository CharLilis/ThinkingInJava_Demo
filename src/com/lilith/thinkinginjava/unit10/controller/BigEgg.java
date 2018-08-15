package com.lilith.thinkinginjava.unit10.controller;

import com.lilith.tool.Print;
/**
 * P212	内部类可以被覆盖吗
 * @author 56580
 *
 */
public class BigEgg extends Egg{
	protected class Yolk{
		public Yolk() {
			Print.println("BigEgg.Yolk");
		}
	}
	public static void main(String[] args) {
		BigEgg be = new BigEgg();
	}
}
class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk() {
			Print.println("Egg.Yolk");
		}
	}
	public Egg() {
		Print.println("Egg");
		y = new Yolk();
	}
}
