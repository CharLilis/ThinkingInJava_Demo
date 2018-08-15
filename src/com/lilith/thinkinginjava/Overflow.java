package com.lilith.thinkinginjava;

import org.junit.Test;

public class Overflow {
	public static void main(String[] args) {
		int big = 0x7fffffff;
		prt("big = "+big);
		int bigger = big * 4;
		prt("bigger = " + bigger);
	}
	
	@Test
	public void testWhile() {
		int i = 0;
		outer:
		for(; true;) {
			inner:
			for(; i<10; i++) {
				prt("i = "+i);
				if(i == 2) {
					prt("continue");
					continue;
				}
				if(i == 3) {
					prt("break");
					i++;
					break;//使用break跳过了递增表达式
				}
				if(i == 7) {
					prt("continue outer");
					i++;
					continue outer;//continue跳出了内部循环，也就意味着跳过了本次的递增表达式
				}
				if(i == 8) {
					prt("break outer");
					break outer;
				}
				for(int k = 0; k < 5; k++) {
					if(k == 3) {
						prt("continue inner");
						continue inner;
					}
				}
			}
		}
	}
	
	
	public static void prt(String str) {
		System.out.println(str);
	}
}
