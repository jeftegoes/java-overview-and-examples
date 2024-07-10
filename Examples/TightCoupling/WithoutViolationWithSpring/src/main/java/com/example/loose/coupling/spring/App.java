package com.example.loose.coupling.spring;

/**
 * Hello world!
 *
 */
public class App 
{
	public class Main {
		public static void main(String[] args) {
			var marioGame = new MarioGame();
			var superContraGame = new SuperContraGame();

			var gameRunner = new GameRunner(superContraGame);
			gameRunner.run();
		}
	}
}
