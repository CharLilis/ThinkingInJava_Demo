package com.lilith.timer;

import java.util.Timer;
import java.util.TimerTask;


public class TimerDemo01 {
	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new Demo(), 0, 10000);
	}

}

class Demo extends TimerTask{
	int j = 0;
	@Override
	public void run() {
		j ++;
		System.out.println(j);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(j+"结束");
	}
	
}
