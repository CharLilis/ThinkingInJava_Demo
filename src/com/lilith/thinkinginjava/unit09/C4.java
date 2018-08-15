package com.lilith.thinkinginjava.unit09;

public class C4 extends C implements I3{

}
interface I1{
	void f();
}
interface I2{
	int f(int i);
}
interface I3{
	int f();
}
class C {
	public int f() {
		return 1;
	}
}
class C2 implements I1,I2{

	@Override
	public int f(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void f() {
	}
	
}

class C3 extends C implements I2{

	@Override
	public int f(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
