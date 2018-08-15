package com.lilith.thinkinginjava.unit09.music5;

import com.lilith.thinkinginjava.unit08.Note;
import com.lilith.tool.Print;
/**
 * P173	接口
 * 1、interfa关键字
 * 2、接口类中的域是隐式的static和final的
 * @author Perform
 *
 */
public class Music5 {
	static void tune(Instrument i) {
		i.play(Note.NIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {new Wind(), 
				new Percussion(), 
				new Stringed(), 
				new Brass(),
				new Woodwind()
				};
		tuneAll(orchestra);
	}
}
interface Instrument{
	int VALUE = 5;//static&final
	void play(Note n);
	void adjust();
}
class Wind implements Instrument{
	public void play(Note n) {
		Print.println(this + ".play() " + n);
	}
	public String toString() {
		return "Wind";
	}
	public void adjust() {
		Print.println(this + ".adjusst()");
	}
}
class Percussion implements Instrument{
	public void play(Note n) {
		Print.println(this + ".play() " + n);
	}
	public String toString() {
		return "Percussion";
	}
	public void adjust() {
		Print.println(this + ".adjusst()");
	}
}
class Stringed implements Instrument{
	public void play(Note n) {
		Print.println(this + ".play() " + n);
	}
	public String toString() {
		return "Stringed";
	}
	public void adjust() {
		Print.println(this + ".adjusst()");
	}
}
class Brass extends Wind{
	public String toString() {
		return "Brass";
	}
}
class Woodwind extends Wind{
	public String toString() {
		return "Woodwind";
	}
}
