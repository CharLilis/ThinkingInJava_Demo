package com.lilith.thinkinginjava.unit10.innerclasses;
/**
 * 内部类的作用域
 * @author Perform
 *
 */
public class Pracel6 {
	private void inernalTracking(boolean b) {
		if(b) {
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip() {
					return id;
				}
			}
			TrackingSlip p = new TrackingSlip("slip");
			String s = p.getSlip();
		}
		//TrackingSlip的作用域在if以内，if以外不能使用TrackingSlip
//		TrackingSlip p = new TrackingSlip("slip");
	}
	public void track() {
		inernalTracking(true);
	}
	public static void main(String[] args) {
		Pracel6 p = new Pracel6();
		p.track();
	}
}
