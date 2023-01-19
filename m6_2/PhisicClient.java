public class PhisicClient extends Client {
    @Override
    public void PutMoney(int moneyAmount) {
        super.PutMoney(moneyAmount);
        System.out.println("Without commission");
    }

    @Override
    public void GetMoney(int moneyAmount) {
        super.GetMoney(moneyAmount);
        System.out.println("Without commission");
    }
}