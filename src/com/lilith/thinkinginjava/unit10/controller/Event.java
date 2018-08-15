package com.lilith.thinkinginjava.unit10.controller;
/**
 * P208	模板模型
 * @author 56580
 *
 */
public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	public Event(long delayTime) {
		this.delayTime = delayTime;
	}
	/**
	 * 启动时间
	 */
	public void start() {
		eventTime = System.nanoTime() + delayTime;
	}
	public boolean ready() {
		return System.nanoTime() > eventTime;
	}
	/**
	 * 将实现方法交由子类实现
	 */
	public abstract void action();
}
