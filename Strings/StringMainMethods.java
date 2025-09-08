import java.util.Arrays;

public class StringMainMethods {
	public static void main(String[] args) {
		String s = " hello ";
		System.out.println("1: s.length(): " + s.length());
		System.out.println("2: s.contains(\"he\"): " + s.contains("he"));
		System.out.println("3: s.isEmpty: " + s.isEmpty());
		System.out.println("4: s.toUpperCase(): " + s.toUpperCase());
		System.out.println("5: s.startsWith(\"h\"): " + s.startsWith("h"));
		System.out.println("6: s.endsWith(\" \"): " + s.endsWith(" "));
		System.out.println("7: s.replace(\"ll\", \"LL\"): " + s.replace("ll", "LL"));
		System.out.println("8: s.trim(): " + s.trim());
		System.out.println("9: s.strip(): " + s.strip());
		System.out.println("10: s.substring(0, 3): " + s.substring(0, 3));
		System.out.println("11: Arrays.toString(s.getBytes()): " + Arrays.toString(s.getBytes()));
		System.out.println("12: Arrays.toString(s.toCharArray()): " + Arrays.toString(s.toCharArray()));
		System.out.println("13: s.charAt(1): " + s.charAt(1));
		System.out.println("14: Arrays.toString(s.split(\"e\")): " + Arrays.toString(s.split("e")));
		System.out.println(s);
	}
}