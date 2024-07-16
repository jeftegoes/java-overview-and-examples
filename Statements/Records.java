public class Records {
    public record Person(String firstName, String lastName) {
    };

    public static void main(String[] args) {
        Person person = new Person("Jefté", "Goes");
        System.out.println(person);
    }
}
