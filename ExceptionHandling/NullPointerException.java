public class NullPointerException {
    public static void main(String[] args) {
        User user = null;
        double orderPrice = 199.99;

        chargeUser(user, orderPrice);
    }

    private static void chargeUser(User user, double orderPrice) {
        user.setAmountOfMoney(user.getAmountOfMoney() - orderPrice);
    }

    public class User {
        private double amountOfMoney;

        public double getAmountOfMoney() {
            return amountOfMoney;
        }

        public void setAmountOfMoney(double amountOfMoney) {
            this.amountOfMoney = amountOfMoney;
        }
    }

}
