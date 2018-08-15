package com.lilith.thinkinginjava.unit13;
/**
 * P294
 * 测试String.format()
 * 可以用此方法格式化输出
 * @author 56580
 *
 */
public class DatabaseException extends Exception{
	public DatabaseException(int transactionID, int queryID, String message) {
		super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
	}
	
	public static void main(String[] args) {
		try {
			throw new DatabaseException(3, 7, "Write failed");
		} catch (DatabaseException e) {
			System.out.println(e);
		}
	}
}
