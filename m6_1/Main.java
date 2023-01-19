public class Main {
    public static void main(String[] args) {
        Order orderDefault = new Order();
        DepositoryOrder depositoryOrder = new DepositoryOrder();
        CardOrder cardOrder = new CardOrder();

        orderDefault.PutMoney(3000);
        orderDefault.DisplayOrder();
        orderDefault.GetMoney(1000);

        System.out.println();

        depositoryOrder.PutMoney(3000);
        depositoryOrder.DisplayOrder();
        depositoryOrder.GetMoney(1000);

        System.out.println();

        cardOrder.PutMoney(3000);
        cardOrder.DisplayOrder();
        cardOrder.GetMoney(1000);
        cardOrder.DisplayOrder();
    }
}
