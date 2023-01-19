public class Order {
    public int moneyAmount;

    public void PutMoney(int money) {
        this.moneyAmount += money;
        System.out.println("Success");
    }

    public void GetMoney(int money) {
        if (money > this.moneyAmount) {
            System.out.println("Impossible to get money. Not enough money");
        } else {
            this.moneyAmount -= money;
            System.out.println("Success");
        }
    }

    public void DisplayOrder() {
        System.out.println("Count of money: " + this.moneyAmount);
    }
}
