package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.List;
/**
 * P421
 * 泛型——对缺乏潜在类型机制的补偿
 * 使用序列实现补偿，将一个方式应用于序列
 * @author Perform
 *
 */
public class ApplyTest{
	public static void main(String[] args) throws Exception {
		List<Shape> shapes = new ArrayList<Shape>();
		for(int i = 0; i < 10; i++) {
			shapes.add(new Shape());
		}
		Apply.apply(shapes, Shape.class.getMethod("rotate"));
		Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5);
		
		List<Square> squares = new ArrayList<Square>();
		for(int i = 0; i < 10; i++) {
			squares.add(new Square());
		}
		Apply.apply(squares, Square.class.getMethod("rotate"));
		Apply.apply(squares, Square.class.getMethod("resize", int.class), 5);
		
		Apply.apply(new FilledList<Shape>(Shape.class, 10), 
					Shape.class.getMethod("rotate"));
		Apply.apply(new FilledList<Shape>(Square.class, 10), 
					Shape.class.getMethod("rotate"));
		
		SimpleQueue<Shape> shapeQ = new SimpleQueue<Shape>();
		for(int i = 0; i < 5; i++) {
			shapeQ.add(new Shape());
			shapeQ.add(new Square());
		}
		Apply.apply(shapeQ, Shape.class.getMethod("rotate"));
	}
}