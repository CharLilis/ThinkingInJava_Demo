package com.lilith.thinkinginjava.unit08;

import com.lilith.tool.Print;
/**
 * P164	子类（导出类）方法重写可以返回父类（基类）方法返回类型的子类（导出类）
 * 	这是Java5加入的协变返回类型的功能
 * @author Perform
 *
 */
public class CovarianReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		Print.println(g);
		m = new WheatMill();
		g = m.process();
		Print.println(g);
	}
}
class Grain{
	public String toString() {
		return "Grain";
	}
}
class Wheat extends Grain{
	public String toString() {
		return "Wheat";
	}
}
class Mill{
	Grain process(){
		return new Grain();
	}
}
class WheatMill extends Mill{
	Wheat process(){
		return new Wheat();
	}
}
