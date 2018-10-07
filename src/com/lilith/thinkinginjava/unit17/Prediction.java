package com.lilith.thinkinginjava.unit17;

import java.util.Random;

public class Prediction {
	private static Random rand = new Random(47);
	private boolean shadow = rand.nextDouble() > 0.5;
	@Override
	public String toString() {
		if(shadow) {
			return "Six more weeks of Winter!";
		}
		return "Early Spring!";
	}
}
