package com.lilith.thinkinginjava.unit17;

import java.time.Month;
import java.util.LinkedList;
import java.util.Stack;
import static net.mindview.util.Print.*;
/**
 * P521
 * 深入研究容器——Java 1.0/1.1的容器
 * @author 56580
 *
 */
public class Stacks {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(Month m : Month.values()) {
			stack.push(m.toString());
		}
		print("stack: " + stack);
		stack.addElement("The last line");
		print("element 5 = " + stack.elementAt(5));
		print("popping elements:");
		while(!stack.empty()) {
			printnb(stack.pop() + " ");
		}
		
		LinkedList<String> lstack = new LinkedList<String>();
		for(Month m : Month.values()) {
			lstack.addFirst(m.toString());
		}
		print("lstack: " + lstack);
		while(!lstack.isEmpty()) {
			printnb(lstack.removeFirst() + " ");
		}
		
		net.mindview.util.Stack<String> stack2 = new net.mindview.util.Stack<String>();
		for(Month m : Month.values()) {
			stack2.push(m.toString());
		}
		print("stack2: " + stack2);
		while(!stack2.empty()) {
			printnb(stack2.pop() + " ");
		}
	}
}
