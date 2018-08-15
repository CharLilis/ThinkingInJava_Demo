package com.lilith.thinkinginjava.unit10.apple;

import com.lilith.thinkinginjava.unit10.innerclasses.Destination;
/**
 * P198	
 * 测试匿名内部类字段的初始化
 * 如果内部类使用外部类传入的变量，变量需要是final修饰的
 * @author 56580
 *
 */
public class Parcel9 {
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
	}
}
