import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ThrowExample {
    public static void main(String[] args) {
        ThrowExample throwExample = new ThrowExample();
        throwExample.transferMoney(null, null, 0);
    }

    private void transferMoney(Account from, Account to, double moneyToTransfer) {
        if (from == null || to == null || from.getMoney() < moneyToTransfer) {
//            throw new IllegalAccessException();
//            throw new IllegalAccessException("Invalid arguments");
            throw new RuntimeException(new FileNotFoundException());
        }
    }

    private void transferMoney2(Account from, Account to, double moneyToTransfer) {
        if (from == null || to == null) {
            throw new RuntimeException(new FileNotFoundException());
        }

        if (from.getMoney() < moneyToTransfer) {
            throw new NotEnoughMoneyException();
        }
    }

    class Account {
        private double money;

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }
    }
}
