package com.lilith.thinkinginjava.unit15;

import net.mindview.util.New;
import java.util.*;

import com.lilith.thinkinginjava.unit14.Person;
import com.lilith.thinkinginjava.unit14.Pet;
/**
 * P362
 * 泛型方法的使用
 * @author Perform
 *
 */
public class SimplerPets {
	public static void main(String[] args) {
		//泛型方法做为赋值结果时，会进行类型检查
		Map<Person, List<? extends Pet>> petPeople = New.map();
	}
}
