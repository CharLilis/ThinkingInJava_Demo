package com.lilith.thinkinginjava.unit15;

import com.lilith.thinkinginjava.unit14.Dog;
/**
 * P419
 * 泛型-潜在类型机制
 * 
 * @author Perform
 *
 */
public class DogsAndRobots {
	public static void main(String[] args) {
		Communicate.perform(new PerformingDog());
		Communicate.perform(new Robot());
	}
}
class PerformingDog extends Dog implements Performs{
	public void speak() {
		System.out.println("Woof");
	}
	public void sit() {
		System.out.println("Sitting");
	}
	void reproduce(){}
}
class Robot implements Performs{
	public void speak() {
		System.out.println("Click!");
	}

	public void sit() {
		System.out.println("Clank!");
	}
	public void oilChange() {}
}
class Communicate{
	/**
	 * Java没有任何机会可以实现潜在的类型机制
	 * @param performer
	 */
	static <T extends Performs> void perform(T performer) {
		performer.speak();
		performer.sit();
	}
}