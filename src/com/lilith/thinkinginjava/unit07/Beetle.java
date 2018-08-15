package com.lilith.thinkinginjava.unit07;

import com.lilith.tool.Print;
/**
 * P146 含有继承、static的类的构造顺序
 * 1、优先初始化静态成员变量，从基类开始，到最外层导出类结束
 * 2、从基类向外层开始构造
 * 3、按声明顺序初始化成员变量
 * 4、构造导出类
 * @author Perform
 *
 */
public class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		Print.println("k = " + k);
		Print.println("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");
	public static void main(String[] args) {
		Print.println("Beetle constructor");
		Beetle b = new Beetle();
		b = new Beetle();
	}
}
class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		Print.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		Print.println(s);
		return 47;
	}
			
}
