package com.lilith.demo;

public class TestThread {
	public static void main(String[] args) {
		new Thread(new Thread1()).start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(new Thread2()).start();
	}
}
