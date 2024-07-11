package com.example.loose.coupling.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		// MarioGame marioGame = new MarioGame();
		// SuperContraGame superContraGame = new SuperContraGame();

		// GameRunner gameRunner = new GameRunner(superContraGame);
		// gameRunner.run();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
	}
}
