package com.lilith.thinkinginjava.unit11;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortSetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random(47);
		SortedSet<Integer> intset = new TreeSet<Integer>();
		int r = 0;
		for(int i = 0; i < 10000; i++) {
			r = rand.nextInt(30);
			if(i<40) {
				System.out.println(r);
				System.out.println(intset);
			}
			intset.add(r);
		}
		System.out.println(intset);
	}
}
