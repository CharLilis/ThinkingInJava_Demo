package com.lilith.thinkinginjava.unit11;

import java.util.Map;
/**
 * P242	测试foreach
 * @author Perform
 *
 */
public class EnvironmentVariables {
	public static void main(String[] args) {
		for(Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
