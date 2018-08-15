package com.lilith.thinkinginjava.unit11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.lilith.tool.Print;
/**
 * P225	练习五
 * @author Perform
 *
 */
public class ListFeaturesInteger {
	private static Random rand = new Random(47);
	public static void main(String[] args) {
		List<Integer> ints = arrayList(7);
		Print.println("1:" + ints);
		Integer sixteen = new Integer(16);
		ints.add(sixteen);
		Print.println("2:" + ints);
		Print.println("3:" + ints.contains(sixteen));
		ints.remove(sixteen);
		Integer i = ints.get(2);
		Print.println("4: i " + i);
		Integer five = new Integer(5);
		Print.println("5:" + ints.indexOf(five));
		Print.println("6:" + ints.remove(five));
		Print.println("7:" + ints.remove(i));
		Print.println("8:" + ints);
		ints.add(3, new Integer(18));
		Print.println("9:" + ints);
		List<Integer> sub = ints.subList(1, 4);
		Print.println("subList:" + sub);
		Print.println("10:" + ints.containsAll(sub));
		Collections.sort(sub);
		Print.println("sorted subList:" + sub);
		Print.println("11:"+ints.containsAll(sub));
		Collections.shuffle(sub, rand);
		Print.println("shuffled subList:" + sub);
		Print.println("12:"+ints.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1),ints.get(4));
		Print.println("sub:" + sub);
		//
		copy.retainAll(sub);
		Print.println("13:" + copy);
		copy = new ArrayList<Integer>(ints);
		copy.remove(2);
		Print.println("14:" + copy);
		copy.removeAll(sub);
		Print.println("15:" + copy);
		copy.set(1, new Integer(18));
		Print.println("16:" + copy);
		copy.addAll(2, sub);
		Print.println("17:" + copy);
		Print.println("18:" + ints.isEmpty());
		ints.clear();
		Print.println("19:" + ints);
		Print.println("20:" + ints.isEmpty());
		ints.addAll(arrayList(4));
		Print.println("21:" + ints);
		Object[] o = ints.toArray();
		Print.println("22:" + o[3]);
		Integer[] in = ints.toArray(new Integer[0]);
		Print.println("23:" + in[3]);
	}
	
	private static List<Integer> arrayList(int size) {
		List<Integer> lists = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			lists.add(new Integer(rand.nextInt(47)));
		}
		return lists;
	}
}
