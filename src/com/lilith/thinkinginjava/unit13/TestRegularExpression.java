package com.lilith.thinkinginjava.unit13;

import static com.lilith.tool.Print.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	public static void main(String[] args) {
		args = new String[] {"abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}"};
		if(args.length < 2) {
			println("Usage:\njava TestRegularExpression characterSequence regularExpression+");
			System.exit(0);	
		}
		println("Input: \"" + args[0] + "\"");
		for(String arg : args) {
			println("Regular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while(m.find()){
				println("Match \""+m.group()+"\" at posttions "+m.start()+"-"+(m.end()-1));
			}
		}
	}

}
