package com.lilith.thinkinginjava.unit08;

import com.lilith.tool.Print;
/**
 * P165	用继承表达行为间的差异，并用字段表达状态上的变化
 * @author Perform
 *
 */
public class Transmogrify {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}
class Actor{
	public void act() {}
}
class HappyActor extends Actor{
	public void act() {
		Print.println("HappyActor");
	}
}
class Sadactor extends Actor{
	public void act() {
		Print.println("Sadactor");
	}
}
class Stage{
	private Actor actor = new HappyActor();
	public void change() {
		actor = new Sadactor();
	}
	public void performPlay() {
		actor.act();
	}
}
