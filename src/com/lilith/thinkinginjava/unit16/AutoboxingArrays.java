package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;

/**
 * P438
 * 数组——多维数组
 * 自动包装
 * @author Perform
 *
 */
public class AutoboxingArrays {
	public static void main(String[] args) {
		Integer[][] a = {
			{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			{}
		};
		System.out.println(Arrays.deepToString(a));
	}
}
