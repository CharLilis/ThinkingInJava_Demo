package com.lilith.thinkinginjava.unit12;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.lilith.tool.Print;
/**
 * P280
 * 捕获做为RuntimeException参数而抛出的异常
 * @author Perform
 *
 */
public class TurnOffChecking {
	public static void main(String[] args) {
		WrapCheckedException wce = new WrapCheckedException();
		for(int i = 0; i < 4; i++) {
			try {
				if(i < 3) {
					wce.throwRuntimeException(i);
				} else
					throw new SomeOtherException();
			} catch (SomeOtherException e) {
				Print.println("SomeOtherException:" + e);
			}catch(RuntimeException re) {
				try {
					throw re.getCause();
				} catch (FileNotFoundException e) {
					Print.println("FileNotFoundException:" + e);
				} catch (IOException e) {
					Print.println("IOException:" + e);
				} catch (Throwable e) {
					Print.println("Throwable:"+e);
				}
			}
		}
	}
}


class WrapCheckedException{
	void throwRuntimeException(int type) {
		try {
			switch(type) {
			case 0:throw new FileNotFoundException();
			case 1:throw new IOException();
			case 2:throw new RuntimeException("where am I?");
			default: return;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherException extends Exception{}
