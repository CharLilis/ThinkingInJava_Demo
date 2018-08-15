package com.lilith.thinkinginjava.unit13;

import static com.lilith.tool.Print.*;

import java.util.Arrays;
import java.util.regex.Pattern;
/**
 * P305
 * 测试Pattern对象的split()
 * @author 56580
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String input = "This!!unusual us!!of exclamation!!points";
		println(Arrays.toString(Pattern.compile("!!").split(input)));
		//第二个参数限制了返回字符串的数量
		println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
	}
}
