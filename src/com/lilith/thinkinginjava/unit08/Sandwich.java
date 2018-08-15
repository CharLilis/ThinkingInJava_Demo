package com.lilith.thinkinginjava.unit08;

import com.lilith.tool.Print;
/**
 * P158	在继承中，导出类的构造顺序
 * 1、从基类开始构造，逐渐向外层扩散，直至最外层导出类为止
 * 2、按声明顺序初始化导出类成员变量
 * 3、导出类构造
 * @author Perform
 *
 */
public class Sandwich extends PortableLunch{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	public Sandwich() {
		Print.println("Sandwich()");
	}
	public static void main(String[] args) {
		new Sandwich();
	}
}
class Meal{
	Meal(){
		Print.println("Meal()");
	}
}
class Bread{
	Bread(){
		Print.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		Print.println("Cheese()");
	}
}
class Lettuce{
	Lettuce(){
		Print.println("Lettuce()");
	}
}
class Lunch extends Meal{
	Lunch(){
		Print.println("Lunch()");
	}
}
class PortableLunch extends Lunch{
	PortableLunch(){
		Print.println("PortableLunch()");
	}
}