package com.lilith.thinkinginjava.unit08;

import com.lilith.tool.Print;
/**
 * P165 练习16
 * @author Perform
 *
 */
public class Starship {
	private AlertStatus status = new BlackStatus();
	void chooseGreen() {
		status = new GreenStatus();
	}
	void chooseWhite() {
		status = new WhiteStatus();
	}
	void act() {
		status.act();
	}
	public static void main(String[] args) {
		Starship s = new Starship();
		s.act();
		s.chooseGreen();
		s.act();
		s.chooseWhite();
		s.act();
	}
}
class AlertStatus{
	void act() {};
}
class WhiteStatus extends AlertStatus{
	void act() {
		Print.println("WhiteStatus");
	}
}
class BlackStatus extends AlertStatus{
	void act() {
		Print.println("BlackStatus");
	}
}
class GreenStatus extends AlertStatus{
	void act() {
		Print.println("GreenStatus");
	}
}
