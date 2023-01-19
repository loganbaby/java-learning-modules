public abstract class Client {
    protected int moneyAmount;

    public void GetBalance() {
        System.out.println("Balance: " + moneyAmount);
    }

    public void PutMoney(int moneyAmount) { this.moneyAmount += moneyAmount; }

    public void GetMoney(int moneyAmount) {
        if (moneyAmount > this.moneyAmount) {
            System.out.println("Not enough money to get");
        } else {
            this.moneyAmount -= moneyAmount;
            System.out.println("Success");
        }
    }
}
