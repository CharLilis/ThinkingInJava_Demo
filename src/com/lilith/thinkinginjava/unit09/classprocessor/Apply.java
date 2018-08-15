package com.lilith.thinkinginjava.unit09.classprocessor;

import java.util.Arrays;

import com.lilith.tool.Print;
/**
 * P174 完全解耦
 * @author Perform
 *
 */
public class Apply {
	public static void process(Processor p, Object s) {
		Print.println("Using Processor " + p.name());
		Print.println(p.process(s));
	}
	public static void process(com.lilith.thinkinginjava.unit09.interfaceprocessor.Processor p, Object s) {
		Print.println("Using Processor " + p.name());
		Print.println(p.process(s));
	}
	public static String s = "Disagreement with beliefs is by definition incorrect";
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}
class Processor{
	public String name() {
		return getClass().getSimpleName();
	}
	Object process(Object input) {
		return input;
	}
}
class Upcase extends Processor{
	String process(Object input) {
		return ((String)input).toUpperCase();
	}
}
class Downcase extends Processor{
	Object process(Object input) {
		return ((String)input).toLowerCase();
	}
}
class Splitter extends Processor{
	Object process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}
