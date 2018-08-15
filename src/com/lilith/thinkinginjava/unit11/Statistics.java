package com.lilith.thinkinginjava.unit11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/**
 * P234	Map
 * @author Perform
 *
 */
public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		int r = 0;
		Integer in = null;
		for(int i = 0; i < 10000; i++) {
			r = rand.nextInt(20);
			in = maps.get(r);
			maps.put(r, in == null?1:++in);
		}
		System.out.println(maps);
	}
}
