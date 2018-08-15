package com.lilith.thinkinginjava.unit10.innerclasses;
/**
 * P197	匿名内部类
 * @author Perform
 *
 */
public class Parcel7 {
	public Contents contents() {
		return new Contents() {
			private int i = 11;
			@Override
			public int value() {
				// TODO Auto-generated method stub
				return 1;
			}
		};
	}
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
	}
}
