package com.lilith.thinkinginjava.unit15;
/**
 * P389
 * 通配符
 * 数组的特殊行为：可以向导出类型的数组赋予基类型的数组引用
 * @author Perform
 *
 */
public class CovariantArrays {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		try {
			fruit[2] = new Fruit();
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			fruit[3] = new Orange();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}