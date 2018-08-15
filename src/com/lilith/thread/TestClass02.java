package com.lilith.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestClass02 {
	public static void main(String[] args) {
		//创建一个可以根据需要自动创建线程的线程池，但是在以前构造的线程可用时将重用他们
//		ExecutorService pools = Executors.newCachedThreadPool();
//		for(int i = 0; i < 5; i++) {
//			//执行任务	
//			pools.esxecute(new T());
//		}
		//建立包含指定数量的线程池，以共享的无解队列方式来运行
//		ExecutorService pools = Executors.newFixedThreadPool(3);
//		for(int i = 0; i < 5; i++) {
//			//执行任务	
//			pools.execute(new T());
//		}
		//创建一个线程池，可以在给定延迟后运行或定期运行
//		ScheduledExecutorService pools = Executors.newScheduledThreadPool(5000);
//		for(int i = 0; i < 5; i++) {
			//执行任务	
//			pools.execute(new T());
			//延迟5秒执行
//			pools.schedule(new T(), 5, TimeUnit.SECONDS);
			//延迟1秒间隔5秒轮循
//			pools.scheduleAtFixedRate(new T(), 1, 5, TimeUnit.SECONDS);
//		}
		//创建一个使用单个worker线程的Excutors，以无解队列方式来运行
//		ExecutorService pools = Executors.newSingleThreadExecutor();
//		for(int i = 0; i < 5; i++) {
			//执行任务
//			pools.execute(new T());
//		}
	}
}

class T implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}

}
