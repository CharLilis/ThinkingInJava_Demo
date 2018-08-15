package com.lilith.thinkinginjava.unit13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * P305
 * Pattern标记，可自定义匹配要求
 * Pattern.CASE_INSENSITIVE:大小写不敏感
 * 可以用“|”来组合不同的匹配要求
 * @author 56580
 *
 */
public class ReFlags {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher("java has regex\nJava has regex\n"
				+ "JAVA has pretty good regular expressions\n"
				+ "Regular expressions ar inJava");
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
