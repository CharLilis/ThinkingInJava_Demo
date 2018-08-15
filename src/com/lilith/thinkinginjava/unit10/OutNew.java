package com.lilith.thinkinginjava.unit10;
/**
 * P193	使用.this和.new
 * 使用外部类对象的引用.new创建内部类对象
 * @author Perform
 *
 */
public class OutNew {
	public class Inner{}
	public static void main(String[] args) {
		OutNew out = new OutNew();
		OutNew.Inner in = out.new Inner();
	}
}

class Test01{
	public static void main(String[] args) {
//		OutNew.Inner in = new Inner();
		OutNew out = new OutNew();
		OutNew.Inner in = out.new Inner();
	}
}
