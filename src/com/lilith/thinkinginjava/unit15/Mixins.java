package com.lilith.thinkinginjava.unit15;

import java.util.Date;
/**
 * P413
 * 泛型-混型
 * @author 56580
 *
 */
public class Mixins {
	public static void main(String[] args) {
		Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
		mixin1.set("test String 1");
		mixin2.set("test String 2");
		System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
		System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2   .getSerialNumber());
	}
}
interface TimeStamped{
	long getStamp();
}
class TimeStampedImp implements TimeStamped{
	private final long timeStamp;
	public TimeStampedImp() {
		timeStamp = new Date().getTime();
	}
	public long getStamp() {
		return timeStamp;
	}
}
interface SerialNumbered{
	long getSerialNumber();
}
class SerialNumberedImp implements SerialNumbered{
	private static long counter = 1;
	private final long serialNumber = counter++;
	public long getSerialNumber() {
		return serialNumber;
	}
}
interface Basic{
	public void set(String val);
	public String get();
}
class BasicImp implements Basic{
	public BasicImp() {}
	private String value;
	public void set(String val) {
		value = val;
	}
	public String get() {
		return value;
	}
}
class Mixin extends BasicImp implements TimeStamped, SerialNumbered{
	private TimeStamped timeStamp = new TimeStampedImp();
	private SerialNumbered serialNumber = new SerialNumberedImp();
	public long getSerialNumber() {
		return serialNumber.getSerialNumber();
	}

	public long getStamp() {
		return timeStamp.getStamp();
	}
	
}