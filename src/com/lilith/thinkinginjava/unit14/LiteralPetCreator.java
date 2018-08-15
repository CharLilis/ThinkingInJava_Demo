package com.lilith.thinkinginjava.unit14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * P327
 * 使用类字面量实现代码
 * @author Perform
 *
 */
public class LiteralPetCreator extends PetCreator{
	public static final List<Class<? extends Pet>> allTypes = 
			Collections.unmodifiableList(Arrays.asList(
					Pet.class, Dog.class, Cat.class, Rodent.class,
					Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
					Cymric.class, Rat.class, Mouse.class, Hamster.class));
	private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());
	
	public List<Class<? extends Pet>> types() {
		return types;
	}
	public static void main(String[] args) {
		System.out.println(types);
	}
}
