package com.lilith.thinkinginjava.unit10.controller;

import com.lilith.tool.Print;
/**
 * P214	
 * 内部类和匿名内部类的应用
 * @author 56580
 *
 */
public class LocalInnerClass {
	private int counts = 0;
	Counter getCounter(final String name) {
		class LocalCounter implements Counter{
			public LocalCounter() {
				Print.println("LocalCounter()");
			}
			@Override
			public int next() {
				Print.println(name + " " +counts);
				return counts++;
			}
		}
		return new LocalCounter();
	}
	Counter getCounter2(final String name) {
		return new Counter() {
			{
				Print.println("Count()");
			}
			@Override
			public int next() {
				Print.println(name + " " +counts);
				return counts++;
			}
		};
	}
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("Local Inner");
		Counter c2 = lic.getCounter2("Anonymous Inner");
		for(int i = 0;  i < 5; i ++)
			c1.next();
		for(int i = 0;  i < 5; i ++)
			c2.next();
	}
}
interface Counter{
	int next();
}
