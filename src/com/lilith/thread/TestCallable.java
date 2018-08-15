package com.lilith.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 * 测试Callable和FutureTask，线程的另一种实现方式，可以设置返回值
 * @author Perform
 *
 */
public class TestCallable {
	public static void main(String[] args) {
		try {
			FutureTask<String> f = new FutureTask<String>(new TCallavle());
			Thread t = new Thread(f);
			t.start();
			System.out.println(f.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class TCallavle implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("测试Callable类");
		return "测试Callable返回值";
	}
	
}