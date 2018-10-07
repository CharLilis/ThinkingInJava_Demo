package com.lilith.thinkinginjava.unit17;

import java.util.WeakHashMap;
/**
 * P519
 * 深入研究容器——持有引用
 * WeakHashMap
 * @author 56580
 *
 */
public class CanonicalMapping {
	public static void main(String[] args) {
		int size = 1000;
		if(args.length > 0) {
			size = new Integer(args[0]);
		}
		
		Key[] keys = new Key[size];
		WeakHashMap<Key, Value> map = new WeakHashMap<Key, Value>();
		for(int i = 0; i < size; i++) {
			Key k = new Key(Integer.toString(i));
			Value v = new Value(Integer.toString(i));
			if(i % 3 == 0) {
				keys[i] = k;
			}
			map.put(k, v);
		}
		System.gc();
	}
}
class Element{
	private String ident;
	public Element(String id) {
		ident = id;
	}
	public String toString() {
		return ident;
	}
	public int hashCode() {
		return ident.hashCode();
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof Element && ident.equals(((Element)o).ident);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalizing " + getClass().getSimpleName() + " " + ident);
	}
}

class Key extends Element{

	public Key(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
}

class Value extends Element{

	public Value(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
}
