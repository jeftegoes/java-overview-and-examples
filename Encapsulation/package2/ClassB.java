package package2;

import package1.ClassA;

public class ClassB extends ClassA {
    public void doSomethingClassB() {
        super.doSomething();
        doSomethingPrivate();
    }

    private void doSomethingPrivate() {
        System.out.println("ClassB is doing something private.");
    }
}
