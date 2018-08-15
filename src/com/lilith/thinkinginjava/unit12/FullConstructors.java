package com.lilith.thinkinginjava.unit12;
/**
 * P252	
 * 自定义异常
 * @author Perform
 *
 */
public class FullConstructors {
	public static void f()throws MyException{
		System.out.println("Throwing MyException form f()");
		throw new MyException();
	}
	public static void g()throws MyException{
		System.out.println("Throwing MyException form g()");
		throw new MyException("Originated g()");
	} 
	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}
}
class MyException extends Exception{
	public MyException() {}
	public MyException(String msg) {
		super(msg);
	}
}
