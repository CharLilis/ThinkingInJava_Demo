package com.lilith.thinkinginjava.unit16;

import java.util.Arrays;
/**
 * P438
 * 数组——多维数组
 * 粗糙数组
 * @author Perform
 *
 */
public class MultidimensionalObjectArrays {
	public static void main(String[] args) {
		BerylliumSphere[][] spheres = {
				{new BerylliumSphere(), new BerylliumSphere()},
				{new BerylliumSphere(), new BerylliumSphere(),
				 new BerylliumSphere(), new BerylliumSphere()},
				{new BerylliumSphere(), new BerylliumSphere(),
				 new BerylliumSphere(), new BerylliumSphere(),
				 new BerylliumSphere(), new BerylliumSphere(),
				 new BerylliumSphere(), new BerylliumSphere()}
		};
		System.out.println(Arrays.deepToString(spheres));
	}
}
