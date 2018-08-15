package com.lilith.thinkinginjava.unit15;
/**
 * P388
 * 边界
 * 通过继承添加边界限制
 * 实现了代码的复用
 * @author Perform
 *
 */
public class InheritBounds {
	public static void main(String[] args) {
		Solid2<Bounded> solid2 = new Solid2<Bounded>(new Bounded());
		solid2.color();
		solid2.getX();
		solid2.weight();
	}
}
class HoldItem<T>{
	T item;
	HoldItem(T item){
		this.item = item;
	}
	T getItem() {
		return item;
	}
}
class Colored2<T extends HasColor> extends HoldItem<T>{
	Colored2(T item) {
		super(item);
	}
	java.awt.Color color(){
		return item.getColor();
	}
}
class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T>{
	ColoredDimension2(T item) {
		super(item);
	}
	int getX() {
		return item.x;
	}
	int getY() {
		return item.y;
	}
	int getZ() {
		return item.z;
	}
}
class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T>{
	Solid2(T item) {
		super(item);
	}
	int weight() {
		return item.weight();
	}
}