package com.lilith.thinkinginjava;
/**
 * P95	变量初始化
 * @author Perform
 *
 */
public class Practice04 {
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 5, 6};
		int[] a2;
		a2 = a1;
		for(int i = 0; i < a2.length; i++) {
			a2[i]++;
			for(int j = 0; j < a1.length; j++) {
				System.out.print("a1["+j+"] = " + a1[j] + " ");
			}
			System.out.println();
		}
	}
}
