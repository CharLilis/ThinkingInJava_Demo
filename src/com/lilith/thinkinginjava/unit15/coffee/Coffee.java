package com.lilith.thinkinginjava.unit15.coffee;

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " +id;
	}
}

