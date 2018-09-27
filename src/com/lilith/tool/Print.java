package com.lilith.tool;

import java.io.*;

/**
 * 打印工具类
 * @author Perform
 *
 */
public class Print {
	public static void println(Object obj) {
		System.out.println(obj);
	}
	
	public static void println() {
		System.out.println();
	}
	
	public static void print(Object obj) {
		System.out.print(obj);
	}
	
	public static PrintStream printf(String format, Object...args){
		return System.out.printf(format, args);
	}
}
