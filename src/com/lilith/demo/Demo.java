package com.lilith.demo;

import java.util.Properties;

import org.junit.Test;

import com.lilith.entity.Person;
import com.lilith.entity.Person.One;
/**
 * 测试线程
 * @author 56580
 *
 */
public class Demo {
	
//	@Test
	public void test01() {
		Person p = new Person();
//		Person.One o = p.new One();
		Person.One o = new Person.One();
		One o1 = new One();

		//匿名内部类
		new Thread(new Runnable() {
			
			public void run() {
				
			}
		});
		
		p.run();
		
	}
	
	@Test
	public void testThread1() {
		new Thread(new Thread1()).start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(new Thread2()).start();
	}
	
	public static void main(String[] args) {
		Properties pro = System.getProperties();
		pro.list(System.out);
		Runtime run = Runtime.getRuntime(); 
		System.out.println("Total Memory："+ run.totalMemory() + "，Free Memory：" + run.freeMemory());
	}
	
	/**
	 * 测试静态方法是否可以被重写
	 */
	public static void fucntion() {
		System.out.println("这是Demo");
	}
	
	public void testF() {
		System.out.println("这是Demo");
	}
}

class Thread1 implements Runnable{
	public void run() {
		System.out.println("Thread1 run....");
		synchronized(Demo.class) {
			System.out.println("Thread1 wait....");
			try {
				Demo.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread1 end...");
	}
}

class Thread2 implements Runnable{
	public void run() {
		System.out.println("Thread2 run....");
		synchronized(Demo.class) {
			System.out.println("Thread2 notify....");
			Demo.class.notify();
			try {
				System.out.println("Thread2 sleep 10s...");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread2 wake up....");
		}
		System.out.println("Thread2 end.....");
	}
}
