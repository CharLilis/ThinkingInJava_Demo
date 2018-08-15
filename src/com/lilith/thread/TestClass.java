package com.lilith.thread;

import org.junit.Test;

public class TestClass {
	static Thread t1 = null;
	static Thread t2 = null;
	
	/**
	 * 测试Thread的join()
	 */
	public static void main(String[] args) {
		t1 = new T1();
		t2 = new T2(t1);
		t1.start();
		t2.start();
	}
}

class T1 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("t1 sleep....");
			Thread.sleep(10000);
			System.out.println("t1 over");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class T2 extends Thread{
	Thread t1;
	public T2(Thread t1) {
		this.t1 = t1;
	}
	@Override
	public void run() {
		System.out.println("t2 action");
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t2 over");
		
	}
}
