package com.lilith.thinkinginjava.unit10;

import com.lilith.tool.Print;
/**
 * P198	
 * @author 56580
 *
 */
public class AnonymousConstructor {
	public static Base base(int i) {
		return new Base(i) {
			{
//				i = 7;
				Print.print("Inside instance initializer");
			}
			@Override
			public void f() {
				Print.print("In anonymous f()s" + i);
			}
		};
	}
	public static void main(String[] args) {
		Base b = base(47);
		b.f();
	}
}
abstract class Base{
	public Base(int i) {
		Print.print("Base Constructor, i = " + i);
	}
	public abstract void f();
}
