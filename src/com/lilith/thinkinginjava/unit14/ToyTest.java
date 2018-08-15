package com.lilith.thinkinginjava.unit14;

import static com.lilith.tool.Print.*;

public class ToyTest {
	static void printInfo(Class cc) {
		println("Class name: " + cc.getName() + " is interface? ["
				+ cc.isInterface() + "]");
		println("Simple name: " + cc.getSimpleName());
		println("Canonical name : " + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("com.lilith.thinkinginjava.unit14.FancyToy");
		} catch (ClassNotFoundException e) {
			println("Can`t find FancyToy");
			System.exit(0);
		}
		printInfo(c);
		for(Class face : c.getInterfaces()) {
			printInfo(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			println("Cannot instantiate");
			e.printStackTrace();
			System.exit(0);
		} catch (IllegalAccessException e) {
			println("Cannot access");
			e.printStackTrace();
			System.exit(0);
		}
		printInfo(obj.getClass());
	}
}
interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	Toy(){}
	Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
	FancyToy(){
		super(1);
	}
}
