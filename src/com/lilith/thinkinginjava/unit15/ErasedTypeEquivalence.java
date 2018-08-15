package com.lilith.thinkinginjava.unit15;

import java.util.*;

/**
 * P372
 * 擦除的神秘之处
 * @author Perform
 *
 */
public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);
	}
}
