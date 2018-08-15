package com.lilith.thinkinginjava.unit15;

import java.util.Arrays;
import java.util.List;

/**
 * P391
 * 通配符
 * @author Perform
 *
 */
public class CompilerIntelligence {
	public static void main(String[] args) {
		List<? extends Fruit> flist = Arrays.asList(new Apple());
		Apple a = (Apple)flist.get(0);
		flist.contains(new Apple());
		flist.indexOf(new Apple());
	}
}
