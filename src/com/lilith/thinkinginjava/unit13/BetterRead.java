package com.lilith.thinkinginjava.unit13;

import java.util.Scanner;
/**
 * P310
 * Scanner的使用
 * 可以用于读流，
 * 可以自动按行和空格来读数据
 * @author Perform
 *
 */
public class BetterRead {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(SimpleRead.input);
		System.out.println("What is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println("How old are you? What is your favorite double?");
		System.out.println("input:<age><double>");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		System.out.println(age);
		System.out.println(favorite);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n", age);
		System.out.format("My favorite double is %f.", favorite / 2);
	}
}
