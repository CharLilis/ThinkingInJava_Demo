package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import static net.mindview.util.Print.*;
/**
 * P514
 * list的排序与查询
 * @author 56580
 *
 */
public class ListSortSearch {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Utilities.list);
		list.addAll(Utilities.list);
		print(list);
		Collections.shuffle(list, new Random(47));
		print("shuffle: " + list);
		ListIterator<String> it = list.listIterator(10);
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		print("Trimmed: " + list);
		Collections.sort(list);
		print("Sorted: " + list);
		String key = list.get(7);
		int index = Collections.binarySearch(list, key);
		print("Location of " + key + " is " + index + ", list.get(" + index + ") = " + list.get(index));
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		print("Case-insensitive sorted: " + list);
		key = list.get(7);
		index = Collections.binarySearch(list, key, String.CASE_INSENSITIVE_ORDER);
		print("Location of " + key + " is " + index + ", list.get(" + index + ") = " + list.get(index));
	}
}
