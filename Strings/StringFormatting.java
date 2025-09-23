public class StringFormatting {
    public static void main(String[] args) {
        String firstName = "Jefté";

        String greetingsTemplate = "Hello, dear %s! Good %s!";

        String morning = "morning";
        String afternoon = "afternoon";
        String evening = "evening";
        String formattedString = String.format(greetingsTemplate, firstName, morning);
        System.out.println(formattedString);

        System.out.printf("You have %d books available at store.\n", 10);

        String str = "String";
        str.concat(" is");
        str.concat(" immutable");
        System.out.println(str);
    }
}
