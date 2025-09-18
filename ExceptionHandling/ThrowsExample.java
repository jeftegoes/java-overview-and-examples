import java.io.FileNotFoundException;

public class ThrowsExample {
    public static void main(String[] args) throws FileNotFoundException {
        ThrowsExample throwsExample = new ThrowsExample();
        throwsExample.someMethod();
    }

    public void someMethod() throws FileNotFoundException {

    }

    class ThrowsExampleOverride extends ThrowsExample {
        @Override
        public void someMethod() throws FileNotFoundException {
            super.someMethod();
        }
    }
}
