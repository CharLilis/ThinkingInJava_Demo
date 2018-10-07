package com.lilith.thinkinginjava.unit17;

public class Individual implements Comparable<Individual>{
	private static long counter = 0;
	private final long id = counter++;
	private String name;
	public Individual() {}
	public Individual(String name) {
		this.name = name;
	}
	public long id() {
		return id;
	}
	@Override
	public boolean equals(Object o) {
		return o instanceof Individual 
				&& id == ((Individual)o).id;
	}
	public int compareTo(Individual o) {
		String frist = getClass().getSimpleName();
		String second = o.getClass().getSimpleName();
		int firstCompare = frist.compareTo(second);
		if(firstCompare != 0) {
			return firstCompare;
		}
		if(name != null && o.name != null) {
			int secondComare = name.compareTo(o.name);
			if(secondComare != 0) {
				return secondComare;
			}
		}
		return o.id < id ? -1 : (o.id == id ? 0 : 1);
	}
}
