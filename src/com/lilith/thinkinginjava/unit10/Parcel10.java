package com.lilith.thinkinginjava.unit10;

import com.lilith.thinkinginjava.unit10.innerclasses.Destination;
import com.lilith.tool.Print;

public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100) {
					Print.print("Over budget!");
				}
			}
			private String label = dest;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tasmania", 101.395F);
		System.out.println(101.395F == 101.395f);
	}
}
