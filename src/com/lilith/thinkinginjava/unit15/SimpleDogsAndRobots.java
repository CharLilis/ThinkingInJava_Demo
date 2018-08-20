package com.lilith.thinkinginjava.unit15;
/**
 * P419
 * 泛型-潜在类型机制
 * 模拟类型潜在机制
 * @author Perform
 *
 */
public class SimpleDogsAndRobots {
	public static void main(String[] args) {
		Communicate.perform(new PerformingDog());
		Communicate.perform(new Robot());
	}
}
class CommunicateSimply{
	static void perform(Performs performer) {
		performer.speak();
		performer.sit();
	}
}
