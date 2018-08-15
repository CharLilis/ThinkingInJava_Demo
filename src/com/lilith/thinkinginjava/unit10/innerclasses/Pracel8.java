package com.lilith.thinkinginjava.unit10.innerclasses;

public class Pracel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			@Override
			public int value() {
				return super.value() * 47;
			}
		};
	} 
	public static void main(String[] args) {
		Pracel8 p = new Pracel8();
		Wrapping w = p.wrapping(10);
	}
}
