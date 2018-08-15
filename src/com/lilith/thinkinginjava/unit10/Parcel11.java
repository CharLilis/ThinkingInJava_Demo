package com.lilith.thinkinginjava.unit10;

import com.lilith.thinkinginjava.unit10.innerclasses.Contents;
import com.lilith.thinkinginjava.unit10.innerclasses.Destination;
/**
 * P202	嵌套类
 * 被static修饰的内部类为嵌套类，无法访问外部类的非静态变量，不会隐式的保留对外部类的引用
 * 所以不会先要创建外部类才能创建内部类
 * @author 56580
 *
 */
public class Parcel11 {
	/**
	 * 嵌套类
	 * @author 56580
	 *
	 */
	private static class ParcelContents implements Contents{
		private	int i = 11;
		@Override
		public int value() {
			return i;
		}
		
	}
	protected static class ParcelDestination implements Destination{
		private String label;
		private ParcelDestination(String whereTo) {
			label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
		public static void f() {};
		static int x = 10;
		static class AnotherLevel{
			public static void f() {}
			static int x = 10;
		}
	}
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	public static Contents contents() {
		return new ParcelContents();
	}
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Tasmania");
	}
}
