package com.lilith.demo;

public class TestThread02 {
	static int i = 0;
	public static void main(String[] args) {
		TestThread02 tt = new TestThread02();
		Add add = tt.new Add();
		Sub sub = tt.new Sub();
		for(int j = 0;  j < 2; j++) {
			new Thread(add).start();
			new Thread(sub).start();
		}
	}
	
	class Add implements Runnable{
		
		@Override
		public synchronized void run() {
			for(int j = 0; j < 100; j++) {
				++i;
				System.out.println(Thread.currentThread().getName()+ " i="+i);
			}
		}
		
	}
	
	class Sub implements Runnable{
		@Override
		public synchronized void run() {
			for(int j = 0; j < 100; j++) {
				--i;
				System.out.println(Thread.currentThread().getName()+ " i="+i);
			}
		}
		
	}
}
