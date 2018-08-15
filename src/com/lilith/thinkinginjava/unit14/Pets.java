package com.lilith.thinkinginjava.unit14;

import java.util.ArrayList;

public class Pets {
	public static final PetCreator creatro = new LiteralPetCreator();
	public static Pet randomPet() {
		return creatro.randomPet();
	}
	public static Pet[] createArray(int size) {
		return creatro.createArray(size);
	}
	public static ArrayList<Pet> arrayList(int size){
		return creatro.arrayList(size);
	}
}
