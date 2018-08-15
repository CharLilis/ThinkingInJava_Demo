package com.lilith.thinkinginjava.unit12;

import com.lilith.tool.Print;

public class Switch {
	private boolean state = false;
	public void on() {
		state = true;
		Print.println(this);
	}
	public void off() {
		state = false;
		Print.println(this);
	}
	public String toString() {
		return state? "on" : "off";
	}
}
