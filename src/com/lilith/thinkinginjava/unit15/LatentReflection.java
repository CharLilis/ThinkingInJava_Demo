package com.lilith.thinkinginjava.unit15;

import java.lang.reflect.Method;
/**
 * P420
 * 泛型-对缺乏潜在类型机制的补偿
 * 简单的利用反射实现
 * @author Perform
 *
 */
public class LatentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mime());
	}
}
class CommunicateReflectively{
	public static void perform(Object speaker) {
		Class<?> spkr = speaker.getClass();
		try {
			try {
				Method m1 = spkr.getMethod("speak");
				m1.invoke(speaker);
			} catch (NoSuchMethodException e) {
				System.out.println(speaker + " cannot speak");
			}
			try {
				Method m2 = spkr.getMethod("sit");
				m2.invoke(speaker);
			} catch (NoSuchMethodException e) {
				System.out.println(speaker + " cannot speak");
			}
			
		} catch (Exception e) {
			throw new RuntimeException(speaker.toString(), e);
		}
	}
}
class Mime{
	public void walkAgainstTheWind() {}
	public void sit() {
		System.out.println("Pretending to sit");
	}
	public void pushInvisibleWalls() {}
	public String toString() {
		return "Mime";
	}
}
class SmartDog{
	public void speak() {
		System.out.println("Woof!");
	}
	public void sit() {
		System.out.println("Sitting");
	}
	public void reproduce() {}
}