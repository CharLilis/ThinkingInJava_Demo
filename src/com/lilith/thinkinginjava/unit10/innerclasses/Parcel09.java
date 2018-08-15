package com.lilith.thinkinginjava.unit10.innerclasses;

import com.lilith.tool.Print;

/**
 * P196	练习9
 * 测试在方法和作用域类定义内部类
 * @author Perform
 *
 */
public class Parcel09 {
	public Inner01 inner() {
		{
			class InnerSubClas02 implements Inner01{
				@Override
				public void go() {
					Print.print("InnerSubClass.go()");
				}
			}
		}
		class InnerSubClass implements Inner01{
			@Override
			public void go() {
				Print.print("InnerSubClass.go()");
			}
		}
		return new InnerSubClass();
//		return new InnerSubClass02();
	}
	
	private class PDestination implements Destination{
		@Override
		public String readLabel() {
			return "PDestination.read()";
		}
		
	}
	public Destination destination() {
		return new PDestination();
	}
	public static void main(String[] args) {
		Parcel09 p = new Parcel09();
		Inner01 in = p.inner();
		in.go();
		Destination d = p.destination();
		d.readLabel();
		Parcel09.PDestination p2 = (Parcel09.PDestination)d;
	}
}
interface Inner01{
	void go();
	public static void main(String[] args) {
		Parcel09 p = new Parcel09();
		Inner01 in = p.inner();
		in.go();
		Destination d = p.destination();
		d.readLabel();
//		Parcel09.PDestination p2 = (Parcel09.PDestination)d;
	}
}
