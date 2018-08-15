package com.lilith.thinkinginjava.unit15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lilith.thinkinginjava.unit14.Cat;
import com.lilith.thinkinginjava.unit14.Dog;
import com.lilith.thinkinginjava.unit14.Pet;
/**
 * P410
 * 泛型-动态类型安全
 * @author 56580
 *
 */
public class CheckedList {
	public static void main(String[] args) {
		List<Dog> dogs1 = new ArrayList<Dog>();
		oldstyleMethod(dogs1);
		List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
		
		try {
			oldstyleMethod(dogs2);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		List<Pet> pegs = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
		pegs.add(new Dog());
		pegs.add(new Cat());
		
	}
	@SuppressWarnings("unchecked")
	public static void oldstyleMethod(List proboblyDog) {
		proboblyDog.add(new Cat());
	}
}
