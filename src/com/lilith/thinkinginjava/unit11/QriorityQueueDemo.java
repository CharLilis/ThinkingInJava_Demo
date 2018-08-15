package com.lilith.thinkinginjava.unit11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
/**
 * P238	优先级队列
 * @author Perform
 *
 */
public class QriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> priortyQueue = new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for(int i = 0; i < 10; i++) {
			priortyQueue.offer(rand.nextInt(i+10));
		}
		QueueDemo.printQ(priortyQueue);
		List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
		priortyQueue = new PriorityQueue<>(ints);
		QueueDemo.printQ(priortyQueue);
		//设置为倒序
		priortyQueue = new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
		priortyQueue.addAll(ints);
		QueueDemo.printQ(priortyQueue);
	}
}
