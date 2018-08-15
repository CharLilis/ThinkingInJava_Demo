package com.lilith.demo;
/**
 * 子线程循环10次，接着主线程循环100，接着又回到子线程循环10次，
 * 接着再回到主线程又循环100，如此循环50次，请写出程序。
 * @author 
 *
 */
public class TestThread03 {
	public static void main(String[] args) {
		for(int i = 0; i < 50; i++) {
			Thread thread1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int k = 0; k <10; k++) {
						System.out.println("子线程第"+k+"次执行");
					}
				}
			});
			thread1.start();
			try {
				thread1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int j = 0; j < 100; j++) {
				System.out.println("主线程第"+j+"次执行");
			}
			System.out.println("第"+i+"次循环");
		}
	}
}
