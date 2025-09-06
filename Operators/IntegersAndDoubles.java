import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntegersAndDoubles {
    public static void main(String[] args) {
        int i = 20;
        System.out.println(i / 3);
        System.out.println(i - (6 * 3));
        System.out.println((double) i / 3);

        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
        System.out.println(rideFee);

        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        System.out.println(amountOfPeople);

        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
        System.out.println(chargePerPerson);

        BigDecimal rounded = new BigDecimal("10.9876");
        System.out.println(rounded.setScale(2, RoundingMode.HALF_UP));

        BigDecimal truncated = new BigDecimal("10.9876");
        System.out.println(truncated.setScale(2, RoundingMode.DOWN));

        double d = 3.1d;
        double d2 = 1.21d;

        System.out.printf("20: %f%n", d - d2);

        BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
        System.out.println(bd3.subtract(bd4));
    }
}