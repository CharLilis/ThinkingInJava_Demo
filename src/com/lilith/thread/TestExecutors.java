package com.lilith.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试线程池的实现
 * @author Perform
 *
 */
public class TestExecutors {
	public static void main(String[] args) {
		//创建一个可以自动管理线程的线程池
//		ExecutorService executors = Executors.newCachedThreadPool();
//		for(int i = 0; i < 3; i++) {
//			executors.execute(new TPool());
//		}
		
		//创建一个拥有指定数量线程的线程池
		ExecutorService executors = Executors.newFixedThreadPool(3);
		for(int i=0; i<6; i++) {
			executors.execute(new TPool());
		}
		
	}
}

class TPool implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("测试，当前线程为：" + t.getName());
	}
	
}
