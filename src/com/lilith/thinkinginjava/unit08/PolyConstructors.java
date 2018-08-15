package com.lilith.thinkinginjava.unit08;

import com.lilith.tool.Print;
/**
 * P163	构造器内部的多态方法的信息
 * 构造顺序：1、在类的信息加载时，分配给对象的储存空间会初始化为二进制的零
 * 			（特殊类型会转换成与之等价的值，对象是null）
 * 			2、构造基类的信息
 * 			3、构造导出类的信息
 * @author Perform
 *
 */
public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
class Glyph{
	void draw() {
		Print.println("Glyph.draw()");
	}
	Glyph() {
		Print.println("Glyph() before draw()");
		draw();
		Print.println("Glyph() after draw()");
	}
}
class RoundGlyph extends Glyph{
	private int radius = 1;
	private Frog f = new Frog();
	RoundGlyph(int r) {
		radius = r;
		Print.println("RoundGlyph.RoundGlyph().radius=" + radius);
		Print.println("RoundGlyph.RoundGlyph().f=" + f);
	}
	void draw() {
		Print.println("PoundGlyph.draw().radius = " + radius);
		Print.println("RoundGlyph.RoundGlyph().f=" + f);
	}
}