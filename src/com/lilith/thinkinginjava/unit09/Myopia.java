package com.lilith.thinkinginjava.unit09;

import com.lilith.tool.Print;
/**
 * P171	练习3
 * 	打印的变量值为0，因为基类通过动态绑定调导出类print()时，导出类的成员变量只是加载入了存储空间，还未初始化
 * @author Perform
 *
 */
public class Myopia {
	public static void main(String[] args) {
		new ReactionistSpectacles();
	}
}
abstract class Spectacles {
	Spectacles() {
		print();
	}
	protected abstract void print(); 
}
class ReactionistSpectacles extends Spectacles{
	private int degree = 200;
	protected void print() {
		Print.println("ReactionistSpectacles.degree = " + degree);
	}
}