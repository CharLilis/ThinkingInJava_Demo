package com.lilith.thinkinginjava.unit13;

import java.util.Scanner;

/**
 * P311
 * Scanner自定义定界符
 * @author 56580
 *
 */
public class ScannerDelimiter {
	public static void main(String[] args) {
		Scanner s = new Scanner("12, 42, 78, 99, 42");
		s.useDelimiter("\\s*,\\s*");
		while(s.hasNextInt()) {
			System.out.println(s.nextInt());
		}
	}
}
