package com.lilith.thinkinginjava.unit15;

import java.awt.Color;

/**
 * P387
 * 边界
 * 泛型边界的应用
 * 当边界中同时有类和接口时，类名要写在前面
 * @author Perform
 *
 */
public class BasicBounds {
	public static void main(String[] args) {
		Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
		solid.getColor();
		solid.getY();
		solid.weight();
	}
}
interface HasColor{
	java.awt.Color getColor();
}
class Colored<T extends HasColor>{
	T item;
	Colored(T item){
		this.item = item;
	}
	T getItem() {
		return item;
	}
	java.awt.Color getColor(){
		return item.getColor();
	}
}
class Dimension{
	public int x, y, z;
}
//class must be first, then interfaces
//class ColoredDimension<T extends HasColor & Dimension>{
//	
//}
class ColoredDimension<T extends Dimension & HasColor>{
	T item;
	ColoredDimension(T item) {
		this.item = item;
	}
	T getItem() {
		return item;
	}
	java.awt.Color getColor(){
		return item.getColor();
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
interface Weight{
	int weight();
}
class Solid<T extends Dimension & HasColor & Weight>{
	T item;
	Solid(T item){
		this.item = item;
	}
	T getItem() {
		return item;
	}
	java.awt.Color getColor(){
		return item.getColor();
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
	int weight() {
		return item.weight();
	}
}
class Bounded extends Dimension implements HasColor, Weight{
	public int weight() {
		return 0;
	}
	public Color getColor() {
		return null;
	}
}