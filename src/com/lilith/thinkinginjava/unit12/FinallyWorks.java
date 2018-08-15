package com.lilith.thinkinginjava.unit12;
/**
 * P265	
 * 证明finally子句总能被执行
 * @author Perform
 *
 */
public class FinallyWorks {
	static int count =0;
	public static void main(String[] args) {
		while(true) {
			try {
				if(count++ == 0) {
					throw new ThreeException();
				}
				System.out.println("No exception");
			} catch (ThreeException e) {
				System.out.println("ThreeException");
			}finally {
				System.out.println("In finally clause");
				if(count == 2) {
					break;
				}
			}
		}
	}
}

class ThreeException extends Exception{}
