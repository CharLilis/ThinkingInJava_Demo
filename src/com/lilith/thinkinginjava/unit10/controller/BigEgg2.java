package com.lilith.thinkinginjava.unit10.controller;

import com.lilith.tool.Print;

public class BigEgg2 extends Egg2{
	protected class Yolk extends Egg2.Yolk{
		public Yolk() {
			Print.println("BigEgg2.Yolk");
		}
		public void f() {
			Print.println("BigEgg2.Yolk.f()");
		}
	}
	public BigEgg2() {
		InsertYolk(new Yolk());
	}
	public static void main(String[] args) {
		Egg2 e = new BigEgg2();
		e.f();
	}
}
class Egg2{
	private Yolk y = new Yolk();
	protected class Yolk{
		public Yolk(){
			Print.println("Egg2.Yolk");
		}
		public void f() {
			Print.println("Egg2.Yolk.f()");
		}
	}
	public Egg2() {
		Print.println("new Egg2()");
	}
	public void InsertYolk(Yolk y) {
		this.y = y;
	}
	public void f() {
		y.f();
	}
}
