package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;

public class MultiDimWrapperArray {
	public static void main(String[] args) {
		Integer[][] a1 = {
			{1, 2, 3, },
			{4, 5, 6, }
		};
		Double[][][] a2 = {
			{{1.1, 2.2},{3.3, 4.4}},
			{{5.5, 6.6},{7.7, 8.8}},
			{{9.9, 1.2},{2.3, 3.4}}
		};
		String[][] a3 = {
			{"The", "Quick", "Sly", "Fox"},
			{"Jumped", "Over"},
			{"The", "Lazy", "Brown", "Dog", "and", "friend"}
		};
		System.out.println(Arrays.deepToString(a1));
		System.out.println(Arrays.deepToString(a2));
		System.out.println(Arrays.deepToString(a3));
	}
}
