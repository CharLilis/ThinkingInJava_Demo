package com.lilith.thinkinginjava.unit10.banana;

import com.lilith.thinkinginjava.unit10.apple.Apple;

public class Banana {
	protected class ReadApple implements Apple{
		public ReadApple() {
		}

		public void eat() {
			System.out.println("Apple is Red");
		}
	}
}
