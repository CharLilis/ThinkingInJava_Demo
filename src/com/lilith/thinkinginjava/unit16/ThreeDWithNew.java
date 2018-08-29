package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;
/**
 * P438
 * 数组——多维数组
 * @author Perform
 *
 */
public class ThreeDWithNew {
	public static void main(String[] args) {
		int[][][] a = new int[2][2][4];
		System.out.println(Arrays.deepToString(a));
	}
}
