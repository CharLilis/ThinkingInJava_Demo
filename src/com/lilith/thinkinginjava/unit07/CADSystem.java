package com.lilith.thinkinginjava.unit07;

import com.lilith.tool.Print;

public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	
	public CADSystem(int i) {
		super(i + 1);
		for(int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j*j);
		}
		c = new Circle(1);
		t = new Triangle(1);
		Print.println("Combined constuctor");
	}
	
	@Override
	void dispose() {
		Print.println("CADSystem.dispose()");
		t.dispose();
		c.dispose();
		for(int i=0; i<lines.length; i++) {
			lines[i].dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			
		} finally {
			x.dispose();
		}
	}
}
class Shape{
	Shape(int i){
		Print.println("Shape constructor");
	}
	void dispose() {
		Print.println("Shape dispose");
	}
}
class Circle extends Shape{

	Circle(int i) {
		super(i);
		Print.println("Drawing Circle");
	}
	void dispose() {
		Print.println("Erasing Circle");
		super.dispose();
	}
	
}
class Triangle extends Shape{

	Triangle(int i) {
		super(i);
		Print.println("Drawing Triangle");
	}
	void dispose() {
		Print.println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape{
	private int start, end;

	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		Print.println("Drawing Line:" + start + "," + end);
	}
	void dispose() {
		Print.println("Erasing Line:" + start + "," + end);
		super.dispose();
	}
	
}


