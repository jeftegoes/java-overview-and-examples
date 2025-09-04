package com.example.loose.coupling.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		// MarioGame marioGame = new MarioGame();
		// SuperContraGame superContraGame = new SuperContraGame();

		// GameRunner gameRunner = new GameRunner(superContraGame);
		// gameRunner.run();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		String name = (String) context.getBean("name");
		int age = (int) context.getBean("age");
		Object person = (Object) context.getBean("person");
		Object address = (Object) context.getBean("myCustomBean");
		Object address2 = (Object) context.getBean(Address.class);
		Object person2 = (Object) context.getBean("person2MethodCall");
		Object person3 = (Object) context.getBean("person3Parameters");

		System.out.println("Bean 'name': " + name);
		System.out.println("Bean 'age': " + age);
		System.out.println("Bean 'person': " + person);
		System.out.println("Bean 'myCustomBean': " + address);
		System.out.println("Bean 'Address.class': " + address2);
		System.out.println("Bean 'person2MethodCall': " + person2);
		System.out.println("Bean 'person3Parameters': " + person3);
	}
}
