package com.lilith.thinkinginjava.unit10.controller;
/**
 * P209
 * 多个内部类对于同一个接口的不同实现
 * @author 56580
 *
 */
public class GreenhouseControls extends Controller{
	private boolean light = false;
	public class LightOn extends Event{
		public LightOn(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			light = true;
		}
		public String toString() {
			return "Light is on";
		}
	}
	
	public class LightOff extends Event{
		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = false;
		}
		@Override
		public String toString() {
			return "Light is off";
		}
	}
	
	private boolean water = false;
	public class WaterOn extends Event{
		public WaterOn(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			water = true;
		}
		@Override
		public String toString() {
			return "Greenhouse is on";
		}
	}
	public class WaterOff extends Event{
		public WaterOff(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			water = true;
		}
		@Override
		public String toString() {
			return "Greenhouse is off";
		}
	}
	private String thermostat = "Day";
	public class ThermostatNight extends Event{
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			thermostat = "Night";
		}
		@Override
		public String toString() {
			return "Thermostat on night stting";
		}
	}
	public class ThermostatDay extends Event{
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			thermostat = "Day";
		}
		@Override
		public String toString() {
			return "Thermostat on day stting";
		}
	}
	public class Bell extends Event{
		public Bell(long delayTime) {
			super(delayTime);
		}
		@Override
		public void action() {
			add(new Bell(delayTime));
		}
		@Override
		public String toString() {
			return "Bing!";
		}
	}
	/**
	 * 重载功能
	 * @author 56580
	 *
	 */
	public class Restart extends Event{
		private Event[] eventList;
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
		}
		@Override
		public void action() {
			for(Event e : eventList) {
				e.start();
				add(e);
			}
			start();
			add(this);
		}
		@Override
		public String toString() {
			return "Restarting system";
		}
	}
	public static class Terminate extends Event{
		public Terminate(long delayTime) {
			super(delayTime);
		}
		public void action() {
			System.exit(0);
		}
		@Override
		public String toString() {
			return "Terminating";
		}
	}
}
