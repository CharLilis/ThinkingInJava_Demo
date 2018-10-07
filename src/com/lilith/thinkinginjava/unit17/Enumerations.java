package com.lilith.thinkinginjava.unit17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;
/**
 * P521
 * 深入研究容器——Java 1.0/1.1的容器
 * @author 56580
 *
 */
public class Enumerations {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Countries.names(10));
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement() + ", ");
		}
		e = Collections.enumeration(new ArrayList<String>());
	}
}
