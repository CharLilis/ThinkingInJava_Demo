package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;
import java.util.Random;
/**
 * P438
 * 数组——多维数组
 * 多维数组中子数组长度不统一，称之为粗糙数组
 * @author Perform
 *
 */
public class RaggedArray {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int[][][] a = new int[rand.nextInt(7)][][];
		for(int i = 0; i < a.length; i++) {
			a[i] = new int[rand.nextInt(5)][];
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = new int[rand.nextInt(5)];
			}
		}
		System.out.println(Arrays.deepToString(a));
	}
}
