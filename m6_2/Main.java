public class Main {
    public static void main(String[] args) {
        IPClient ipClient = new IPClient();
        ipClient.PutMoney(3000);
        ipClient.PutMoney(500);
        ipClient.GetBalance();

        System.out.println();

        UridicClient uridicClient = new UridicClient();
        uridicClient.PutMoney(3000);
        uridicClient.PutMoney(500);
        uridicClient.GetBalance();

        System.out.println();

        PhisicClient phisicClient = new PhisicClient();
        phisicClient.PutMoney(3000);
        phisicClient.PutMoney(500);
        phisicClient.GetBalance();
    }
}
