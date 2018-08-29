package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;
/**
 * P437
 * 数组——多维数组
 * @author Perform
 *
 */
public class MultidimensionalPrimitiveArray {
	public static void main(String[] args) {
		int[][] a = {
				{1, 2, 3},
				{4, 5, 6}
		};
		//多维数组打印方式
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.toString(a));
	}
}
