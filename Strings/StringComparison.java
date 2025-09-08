public class StringComparison {
    public static void main(String[] args) {
        String s = " hello ";

        String s2 = " hello ";
        System.out.println("s == s2: " + (s == s2));

        String s3 = new String(" hello ");
        System.out.println("s == s3: " + (s == s3));
        System.out.println("s.equals(s3): " + (s.equals(s3)));
        System.out.println("s == s3.intern(): " + (s == s3.intern()));

        String firstName = "Jefté";
        String firstName2 = "jefté";
        System.out.println("firstName.equals(firstName2): " + firstName.equals(firstName2));
        System.out.println("firstName.equals(firstName2): " + firstName.equalsIgnoreCase(firstName2));
    }
}