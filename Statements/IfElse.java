public class IfElse {
    public static void main(String[] args) {
        System.out.println("Hello, Jefté!");
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country.");
        }

        String s = (isDomestic) ? "This car is domestic." : "This car is not domestic.";
        System.out.println(s);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Get some remainder.");
        }

        int amountOfMoneyOnAccount = 100;
        int itemPrice = 200;

        if (amountOfMoneyOnAccount < itemPrice)
            System.out.println("You don't have enough money on your account to purchase " + "this item.");
        else
            System.out.println("Item is purchased.");
        System.out.println("I'm not in else block here.");

        int i1 = 3;
        int i2 = 2;
        int i3 = 10;
        if (i1 > i2) {
            if (i1 > i3)
                System.out.println("i1 is more than i2 and i3.");
            else
                System.out.println("i1 is more than i2 but less than i3.");
        }

        int orderPrice = 1000;

        if (orderPrice > 0 && orderPrice < 100) {
            System.out.println("You have 5% discount for this order.");
        } else if (orderPrice >= 100 && orderPrice < 500) {
            System.out.println("You have 10% discount for this order.");
        } else if (orderPrice >= 500 && orderPrice < 5000) {
            System.out.println("You have 15% discount for this order.");
        }
    }
}