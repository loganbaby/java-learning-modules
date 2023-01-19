public class CardOrder extends Order {
    @Override public void GetMoney(int money) {
        if (money > this.moneyAmount) {
            System.out.println("Impossible to get money. Not enough money");
        } else {
            this.moneyAmount = (int) (this.moneyAmount - money - (money * 0.01));
            System.out.println("Success");
        }
    }
}
