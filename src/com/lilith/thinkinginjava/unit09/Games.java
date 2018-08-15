package com.lilith.thinkinginjava.unit09;

import com.lilith.tool.Print;
/**
 * P188	接口与工厂
 * 在同一个棋盘上既可以下chess，也可以下checker
 * 这种情况可以使用工厂模式这种有额外级别间接性的
 * @author Perform
 *
 */
public class Games {
	public static void playGame(GameFactory factory) {
		Game g = factory.getGame();
		while(g.move());
	}
	public static void main(String[] args) {
		playGame(new CheckerFactory());
		playGame(new ChessFactory());
	}
}
interface Game{
	boolean move();
}
interface GameFactory{
	Game getGame();
}
class Checkers implements Game{
	private int moves = 0;
	private static final int MOVES = 3;
	public boolean move() {
		Print.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
}
class CheckerFactory implements GameFactory{
	public Game getGame() {
		return new Checkers();
	}
}
class Chess implements Game{
	private int moves = 0;
	private static final int MOVES = 4;
	public boolean move() {
		Print.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
}
class ChessFactory implements GameFactory{
	public Game getGame() {
		return new Chess();
	}
}
