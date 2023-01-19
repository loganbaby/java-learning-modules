public class IPClient extends Client {
    @Override
    public void PutMoney(int moneyAmount) {
        if (moneyAmount < 1000) {
            this.moneyAmount += (moneyAmount - moneyAmount * 0.01);
            System.out.println("Commission 1%");
        } else {
            this.moneyAmount += (moneyAmount - moneyAmount * 0.05);
            System.out.println("Commission 0.5%");
        }
    }
}
