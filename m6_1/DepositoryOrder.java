import java.time.LocalDateTime;

public class DepositoryOrder extends Order {
    private LocalDateTime lastTransaction;

    @Override public void PutMoney(int money) {
        this.moneyAmount += money;
        this.lastTransaction = LocalDateTime.now();
        System.out.println("Success");
    }

    @Override public void GetMoney(int money) {
        if (money > this.moneyAmount) {
            System.out.println("Impossible to get money. Not enough money");
        } else {
            if (!LocalDateTime.now().isBefore(lastTransaction)) {
                System.out.println("Impossible to get money. Wait for a month please");
            } else {
                this.moneyAmount -= money;
                System.out.println("Success");
            }
        }
    }
}
