package com.lilith.thinkinginjava.unit13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.lilith.tool.Print.*;
/**
 * P306
 * 测试正则表达式的替换操作
 * @author 56580
 *
 */
public class TheReplacements {
	public static void main(String[] args) {
		String s = "/*! Here`s a block of text to use as input to the regular expression matcher. "
				+ "Note that we`ll first extract the block of text by looking for"
				+ "the special delimiters. then process the extracted block!*/";
		
		Matcher m = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
		if(m.find()) {
			s = m.group(1);
		}
		s = s.replaceAll(" {2,}", " ");
		s = s.replaceAll("(?m)^ +", "");
		println(s);
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		StringBuffer sb = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		m = p.matcher(s);
		while(m.find()) {
			m.appendReplacement(sb, m.group().toUpperCase());
		}
		m.appendTail(sb);
		println(sb);
		
	}
}
