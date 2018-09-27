package com.lilith.thinkinginjava.unit17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 * P477
 * 深入研究容器——Set和存储顺序
 * HashSet：不可重复，有序
 * TreeSet：自定义对象实现
 * LinkedHashSet：不可重复，有序
 * @author Perform
 *
 */
public class TypesForSets {
	static <T> Set<T> fill(Set<T> set, Class<T> type){
		try {
			for(int i = 0; i < 10; i++) {
				set.add(type.getConstructor(int.class).newInstance(i));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return set;
	}
	static <T> void test(Set<T> set, Class<T> type) {
		fill(set, type);
		fill(set, type);
		fill(set, type);
		System.out.println(set);
	}
	public static void main(String[] args) {
		test(new HashSet<HashType>(), HashType.class);
		test(new LinkedHashSet<HashType>(), HashType.class);
		//实现compareTo()
		test(new TreeSet<TreeType>(), TreeType.class);
		//未实现hasCode()，HashSet无法进行排序和去重
		test(new HashSet<SetType>(), SetType.class);
		test(new HashSet<TreeType>(), TreeType.class);
		//根据插入顺序排序，根据hasCode()去重
		test(new LinkedHashSet<SetType>(), SetType.class);
		test(new LinkedHashSet<TreeType>(), TreeType.class);
		try {
			test(new TreeSet<SetType>(), SetType.class);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			test(new TreeSet<HashType>(), HashType.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
/**
 * 自定义对象
 * @author 56580
 *
 */
class SetType{
	int i;
	public SetType(int n) { i = n;}
	public boolean equals(Object o) {
		return o instanceof SetType && ( i == ((SetType)o).i);
	}
	public String toString() {
		return Integer.toString(i);
	}
}
/**
 * 实现了hashCode()
 * @author 56580
 *
 */
class HashType extends SetType{
	public HashType(int n) {
		super(n);
	}
	@Override
	public int hashCode() {
		return i;
	}
}
/**
 * 实现了compareTo()
 * @author 56580
 *
 */
class TreeType extends SetType implements Comparable<TreeType>{
	public TreeType(int n) {
		super(n);
	}
	public int compareTo(TreeType o) {
		return o.i < i ? -1 : (i == o.i ? 0 : 1);
	}
}
