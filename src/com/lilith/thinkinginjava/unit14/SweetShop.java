package com.lilith.thinkinginjava.unit14;

import static com.lilith.tool.Print.*;

public class SweetShop {
	public static void main(String[] args) {
		println("inside main");
		new Candy();
		println("After creating Candy");
		try {
			Class.forName("com.lilith.thinkinginjava.unit14.Gum");
		} catch (ClassNotFoundException e) {
			println("Couldn`t find Gum");
		}
		println("After Class.forName(\"Gum\")");
		new Cookie();
		println("After creating Cookie");
	}
}
class Candy{
	static {println("Loading Candy");}
}
class Gum{
	static {println("Loading Gum");}
}
class Cookie{
	static {println("Loading Cookie");}
}