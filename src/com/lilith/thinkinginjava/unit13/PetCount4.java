package com.lilith.thinkinginjava.unit13;

import com.lilith.thinkinginjava.unit14.Pet;
import com.lilith.thinkinginjava.unit14.Pets;
import com.lilith.tool.Print;

public class PetCount4 {
	public static void main(String[] args) {
		TypeCounter counter = new TypeCounter(Pet.class);
		System.out.println(Pets.createArray(20));
		for(Pet pet : Pets.createArray(20)) {
			Print.print(pet.getClass().getSimpleName() + " ");
			counter.count(pet);
		}
		Print.println("");
		Print.println(counter);
	}
}
