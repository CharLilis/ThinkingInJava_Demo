package com.lilith.thinkinginjava.unit08;

import com.lilith.tool.Print;
/**
 * P159	继承与清理
 * 对于成员变量的销毁顺序应该与声明顺序相反
 * 类的销毁顺序应与构造顺序相反
 * @author Perform
 *
 */
public class Frog extends Amphibian{
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	public Frog() {
		Print.println("Frog()");
	}
	protected void dispose() {
		Print.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		Frog frog = new Frog();
		Print.println("Bye!");
		frog.dispose();
	}
}
class Characteristic{
	private String s;
	Characteristic(String s) {
		this.s = s;
		Print.println("Creating Characteristic " + s);
	}
	protected void dispose() {
		Print.println("dispose Characteristic " + s);
	}
}
class Description{
	private String s;
	Description(String s) {
		this.s = s;
		Print.println("Creating Description " + s);
	}
	protected void dispose() {
		Print.println("dispose Description " + s);
	}
}
class LivingCreature{
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	LivingCreature() {
		Print.println("LivingCreature()");
	}
	protected void dispose() {
		Print.println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}
class Animal extends LivingCreature{
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	Animal() {
		Print.println("Animal()");
	}
	protected void dispose() {
		Print.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
class Amphibian extends Animal{
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	Amphibian() {
		Print.println("Amphibian()");
	}
	protected void dispose() {
		Print.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}