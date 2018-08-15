package com.lilith.thinkinginjava;

public class Practice05 {
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.cup1.f(99);
	}
	static Cups cup1 = new Cups();
	static Cups cup2 = new Cups();
}
class Cup{
	Cup(int marker){
		print("marker(" + marker + ")");
	}
	void f(int marker) {
		print("f("+marker+")");
	}
	void print(String s) {
		System.out.println(s);
	}
}
class Cups{
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		System.out.println("Cups()");
	}
}
