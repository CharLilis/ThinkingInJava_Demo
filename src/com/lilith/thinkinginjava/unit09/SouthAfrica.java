package com.lilith.thinkinginjava.unit09;

import com.lilith.tool.Print;
/**
 * P172	练习4
 *	在继承关系中，适当使用抽象方法可避免向下转型
 * @author Perform
 *
 */
public class SouthAfrica {
	public static void main(String[] args) {
		Snake s = new Cobra();
		Cobra c = Cobra.morph(s);
		c.prey();
		s.prey();
	}
}
abstract class Snake{
	abstract void prey();
	
}
class Cobra extends Snake{
	public void prey() {
		Print.println("Cobra prey");
	}
	static Cobra morph(Snake s) {
		return (Cobra)s;
	}
}
