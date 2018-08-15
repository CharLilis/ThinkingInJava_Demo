package com.lilith.thinkinginjava.unit10.innerclasses;
/**
 * P195
 * @author 56580
 *
 */
public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
//		Parcel4.PContents = p.new PContents();
//		Parcel4.PDestination pd = p.new PDestination();
	}
}
class Parcel4{
	private class PContents implements Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	protected class PDestination implements Destination{
		private String label;
		private PDestination(String whereTo) {
			label = whereTo;
		}
		public String readLabel() {
			return label;
		}
	}
	public Destination destination(String s) {
		return new PDestination(s);
	}
	public Contents contents() {
		return new PContents();
	}
}
