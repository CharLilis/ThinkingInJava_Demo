package com.lilith.thinkinginjava.unit10;

import com.lilith.tool.Print;
/**
 * P192	链接到外部类
 * 内部类可以访问外围对象的所有成员，而不需要任何特殊条件
 * @author Perform
 *
 */
public class Sequence {
	private Object[] items;
	private Coordinate[] cs;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
		cs = new Coordinate[size];
	}
	public void add(Object x) {
		if(next < items.length) {
			items[next] = x;
			cs[next++] = new Coordinate((String)x);
		}
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public Coordinate current2() {
			return cs[i];
		}
		public void next() {
			if(i < items.length)
				i++;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence seq = new Sequence(10);
		for(int i=0; i < 10; i++) {
			seq.add(Integer.toString(i));
		}
		Selector selecter = seq.selector();
		while(!selecter.end()) {
			Print.print(selecter.current());
			Print.print(selecter.current2()+" ");
			selecter.next();
		}
	}
}
interface Selector{
	boolean end();
	Object current();
	Object current2();
	void next();
}
class Coordinate{
	private String index;
	public Coordinate(String index) {
		this.index = index;
	}
	public String toString() {
		return index;
	}
}
