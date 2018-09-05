package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;

public class TestGenerated {
	public static void main(String[] args) {
		Integer[] a = {9, 8, 7, 6};
		System.out.println(Arrays.toString(a));
		a = Generated.array(a, new net.mindview.util.CountingGenerator.Integer());
		System.out.println(Arrays.toString(a));
		Integer[] b = Generated.array(Integer.class, new net.mindview.util.CountingGenerator.Integer(), 15);
		System.out.println(Arrays.toString(b));
	}
}
