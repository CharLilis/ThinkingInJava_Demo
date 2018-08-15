package com.lilith.thinkinginjava.unit10;

import com.lilith.tool.Print;
/**
 * P191 对于内部类的使用
 * 如果想从外部类的非静态方法之外调用内部类的对象，
 * 需要使用OuterClassName.InnerClassName指明具体类
 * @author Perform
 *
 */
public class Parcel2 {
	class Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	public Destination to(String s) {
		return new Destination(s);
	}
	public Contents contents() {
		return new Contents();
	}
	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		Print.println(d.readLabel());
	}
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
	}
}
