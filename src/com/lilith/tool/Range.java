package com.lilith.tool;
/**
 * Array creation methods that can be used without
 * qualifiers, using Java SE5 static imports
 * @author Perform
 *
 */
public class Range {
	public static int[] range(int n) {
		int[] result = new int[n];
		for(int i = 0; i < n; i++) {
			result[i] = i;
		}
		return result;
	}
	
	public static int[] range(int start, int end) {
		int size = start - end;
		int[] result = new int[size];
		for(int i = 0; i < size; i++) {
			result[i] = start + i;
		}
		return result;
	}
	
	public static int[] range(int start, int end, int step) {
		int size = (start - end)/step;
		int[] result = new int[size];
		for(int i = 0; i < size; i++) {
			result[i] = start + (i * step);
		}
		return result;
	}
}
