package com.lilith.thinkinginjava.unit09;

import java.util.Random;

import com.lilith.tool.Print;

/**
 * P188 练习2 抛硬币和掷骰子
 * @author Perform
 *
 */
public class Games2 {
	public static void playGame(Action ac) {
		Game1 g = ac.getGame();
		g.toss();
		Print.println(g.toss());
	}
	public static void main(String[] args) {
		playGame(new DiceFactory());
		playGame(new CoinFactory());
	}
}
interface Game1{
	int toss();
}
interface Action{
	Game1 getGame();
}
class Coin implements Game1{
	public int toss() {
		return new Random().nextInt(1);
	}
}
class Dice implements Game1{
	public int toss() {
		return new Random().nextInt(5);
	}
}
class CoinFactory implements Action{
	public Game1 getGame() {
		return new Coin();
	}
}
class DiceFactory implements Action{
	public Game1 getGame() {
		return new Dice();
	}
}

