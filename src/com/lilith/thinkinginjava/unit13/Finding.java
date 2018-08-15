package com.lilith.thinkinginjava.unit13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.lilith.tool.Print.*;
/**
 * P301
 * 测试Matcher的find()
 * @author Perform
 *
 */
public class Finding {
	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+")
				.matcher("Evening is full of the linnet`s wings");
		while(m.find()) {
			print(m.group() + " ");
		}
		println("");
		int i =0;
		while(m.find(i)) {
			print(m.group() + " ");
			i++;
		}
	}
}
