public class UridicClient extends Client {
    @Override
    public void PutMoney(int moneyAmount) {
        this.moneyAmount += (moneyAmount - moneyAmount * 0.01);
        System.out.println("Commission 1%");
    }

    @Override
    public void GetMoney(int moneyAmount) {
        if (moneyAmount > this.moneyAmount) {
            System.out.println("Not enough money to get");
        } else {
            this.moneyAmount -= (moneyAmount + moneyAmount * 0.01);
            System.out.println("Success, with commission 1%");
        }
    }
}
