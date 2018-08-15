package com.lilith.thread;
/**
 * 测试wait()和notify()/notifyAll()方法
 * wait()：使线程放弃同步锁，进入等待（阻塞）状态，
 * notify()/notifyAll()：唤起进入等待的线程，该线程进入就绪状态，获得同步锁后将继续运行
 * @author Perform
 *
 */
public class Demo01 extends Thread{
	Object lock;
	
	public Demo01(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		try {
			synchronized(lock) {
				System.out.println("wait start.....");
					lock.wait();
				System.out.println("wait end.....");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Object lock = new Object();
		Thread t1 = new Thread(new Demo01(lock));
		Thread t2 = new Thread(new Demo02(lock));
		
		t1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
	}
}
class Demo02 extends Thread{
	Object lock;
	public Demo02(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("notify start.....");
			lock.notify();
			System.out.println("notify end.....");
		}
	}
}
