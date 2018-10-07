package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
/**
 * P517
 * 容器的快速报错机制(fail-fast)
 * @author 56580
 *
 */
public class FailFast {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("one");
		try {
			it.next();
		} catch (ConcurrentModificationException e) {
			System.out.println(e);
		}
	}
}
