package com.lilith.thinkinginjava.unit08;

import java.util.Random;

import com.lilith.tool.Print;
/**
 * P152	对于多态的练习，测试向上转型时，其成员变量之间的关系
 * 继承只涉及到类中的方法，导出类和基类的成员变量是独立的，
 * 可以使用super关键字调用
 * @author Perform
 *
 */
public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for(int i=0; i<s.length; i++) {
			s[i] = gen.next();
		}
		for(Shape shp : s) {
			shp.draw();
		}
		Shape c = new Circle();
		c.draw();
		Circle i = new Circle();
		i.draw();
	}
}
class Shape{
	int i;
	public Shape() {
		Print.println("Shape contructor");
		Print.println("Shape.i = " + i);
	}
	public void draw() {};
	public void erase() {};
}
class Circle extends Shape{
	int j;
	public Circle() {
		j = super.i++;
		Print.println("Circle contructor");
		Print.println("Circle.i = "+i);
		Print.println("Circle.j = "+j);
	}
	public void draw() {
		Print.println("Circle Drawing");
		Print.println("Circle.j = "+j);
		j = super.i;
		Print.println("Circle.j = "+j);
	};
	public void erase() {
		Print.println("Circle Erasing");
	};
}
class Square extends Shape{
	public void draw() {
		Print.println("Square Drawing");
	};
	public void erase() {
		Print.println("Square Erasing");
	};
}
class Triangle extends Shape{
	public void draw() {
		Print.println("Triangle Drawing");
	};
	public void erase() {
		Print.println("Triangle Erasing");
	};
}
class RandomShapeGenerator{
	private Random rand = new Random(47);
	public Shape next() {
		int i = rand.nextInt(4);
//		i = 3;
		switch(i){
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
		}
	}
}