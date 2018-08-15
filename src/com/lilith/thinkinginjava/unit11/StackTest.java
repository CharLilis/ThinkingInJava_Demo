package com.lilith.thinkinginjava.unit11;
/**
 * P230
 * StackTest
 * @author Perform
 *
 */
public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(String s : "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		java.util.Stack<String> stack2 = new java.util.Stack<String>();
		for(String s : "My dog has fleas".split(" ")) {
			stack2.push(s);
		}
		while(!stack2.isEmpty()) {
			System.out.print(stack2.pop() + " ");
		}
	}
}
