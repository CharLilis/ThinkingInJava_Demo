package com.lilith.thinkinginjava.unit09.music4;

import com.lilith.thinkinginjava.unit08.Note;
import com.lilith.tool.Print;
/**
 * P170	抽象方法
 * @author Perform
 *
 */
public class Music4 {
	static void tune(Instrument i) {
		i.play(Note.NIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
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
abstract class Instrument{
	private int i;
	public abstract void play(Note n);
	public String what() {
		return "Instrument";
	}
	public abstract void adjust();
}
class Wind extends Instrument{
	public void play(Note n) {
		Print.println("Wind.play() " + n);
	}
	public String what() {
		return "Wind";
	}
	public void adjust() {}
}
class Percussion extends Instrument{
	public void play(Note n) {
		Print.println("Percussion.play() " + n);
	}
	public String what() {
		return "Percussion";
	}
	public void adjust() {}
}
class Stringed extends Instrument{
	public void play(Note n) {
		Print.println("Stringed.play() " + n);
	}
	public String what() {
		return "Stringed";
	}
	public void adjust() {}
}
class Brass extends Wind{
	public void play(Note n) {
		Print.println("Brass.play() " + n);
	}
	public void adjust() {
		Print.println("Brass.adjust()");
	}
}
class Woodwind extends Wind{
	public void play(Note n) {
		Print.println("Woodwind.play() " + n);
	}
	public String what() {
		return "Woodwind";
	}
}
