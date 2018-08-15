package com.lilith.thinkinginjava.unit14;

import java.util.Arrays;
import java.util.List;

/**
 * P313
 * 多态
 * @author Perform
 *
 */
public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(
				new Circle(), new Square(), new Triangle());
		for(Shape shape : shapeList) {
			shape.draw();
		}
	}
}
abstract class Shape{
	void draw() {
		System.out.println(this + ".draw()");
	}
	abstract public String toString();
}
class Circle extends Shape{
	@Override
	public String toString() {
		return "Circle";
	}
}
class Square extends Shape{
	@Override
	public String toString() {
		return "Square";
	}
}
class Triangle extends Shape{
	@Override
	public String toString() {
		return "Triangle";
	}
}