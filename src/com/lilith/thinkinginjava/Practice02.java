package com.lilith.thinkinginjava;
/**
 * P89	垃圾回收
 * @author 56580
 *
 */
public class Practice02 {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
	}
}
class Book{
	boolean ckeckedOut = false;
	Book(boolean checkOut){
		ckeckedOut = checkOut;
	}
	void checkIn() {
		ckeckedOut = false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		if(ckeckedOut) {
			System.out.println("Error: check out");
		}
	}
}
