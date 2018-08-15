package com.lilith.thinkinginjava.unit12;

import com.lilith.tool.Print;
/**
 * P257	测试Exception中的API
 * @author Perform
 *
 */
public class ExceptionMethods {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			Print.println("Caught Exception");
			Print.println("getMessage:" + e.getMessage());
			Print.println("getLocalizedMessage:" + e.getLocalizedMessage());
			Print.println("toString:" + e);
			Print.println("printStackTrace:");
			e.printStackTrace(System.out);
		}
	}
}
