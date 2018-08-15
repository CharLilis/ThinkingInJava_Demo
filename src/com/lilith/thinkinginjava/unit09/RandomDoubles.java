package com.lilith.thinkinginjava.unit09;

import java.util.Random;

import com.lilith.tool.Print;

/**
 * P183
 * @author Perform
 *
 */
public class RandomDoubles {
	private static Random rand = new Random(47);
	public double next() {
		return rand.nextDouble();
	}
	public static void main(String[] args) {
		RandomDoubles rd = new RandomDoubles();
		for(int i=0; i<7; i++) {
			Print.println(rd.next() + " ");
		}
	}
}
