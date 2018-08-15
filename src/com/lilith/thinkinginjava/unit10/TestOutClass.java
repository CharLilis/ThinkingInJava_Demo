package com.lilith.thinkinginjava.unit10;

import com.lilith.tool.Print;
/**
 * P195 练习7
 * 内部类可以使用外部类的私有域和私有方法，
 * 内部类中所操作动作会隐式的关联在外部类的对象上
 * 外部类可以通过创建在方法内创建内部类对象访问内部类的private元素
 * @author 56580
 *
 */
public class TestOutClass {
	public static void main(String[] args) {
		OutClass out = new OutClass(20);
		out.print();
		OutClass.Inner inn = out.inner();
		inn.test1();
		out.print();
		
	}
}
class OutClass{
	private int index;
	public OutClass(int index) {
		this.index = index;
	}
	
	private void test() {
		System.out.println("OutClass.test()");
	}
	
	public void print() {
		Print.print(index);
	}
	public void testInn() {
		System.out.println(new Inner().cc);
	}
	public class Inner{
		private int cc = 10;
		public void test1() {
			index++;
			test();
		}
	}
	
	public Inner inner() {
		return new Inner();
	}
}