package com.lilith.thinkinginjava.unit12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;
/**
 * 
 * @author Perform
 *
 */
public class LoggingExceptiongs2 {
	private static Logger logger = Logger.getLogger("LoggingExceptiongs2");
	static void logException(Exception e) {
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		logger.severe(e.toString());
	}
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			logException(e);
		}
	}
}
