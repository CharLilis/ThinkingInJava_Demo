package com.lilith.thinkinginjava.unit12;

import com.lilith.tool.Print;
/**
 *P267
 *当return和finally同时存在，且return在finally之前时，finally也会执行
 * @author Perform
 *
 */
public class MultipleReturns {
	public static void f(int i) {
		Print.println("Initialization that requires cleanup");
		try {
			Print.println("Point 1");
			if(i == 1) return; 
			Print.println("Point 2");
			if(i == 2) return; 
			Print.println("Point 3");
			if(i == 3) return;
			Print.println("End");
			return;
		} finally {
			Print.println("Performing cleanup");
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			f(i);
		}
	}
}
