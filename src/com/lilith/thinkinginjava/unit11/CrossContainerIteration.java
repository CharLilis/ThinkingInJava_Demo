package com.lilith.thinkinginjava.unit11;

import java.util.Iterator;

import com.lilith.thinkinginjava.unit14.Pet;

public class CrossContainerIteration {
	public static void display(Iterator<Pet> it) {
		while (it.hasNext()) {
			Pet p = it.next();
			System.out.println("" + p);
		}
	}
}
