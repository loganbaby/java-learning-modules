import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PhoneFilter filter = new PhoneFilter(in.nextLine());
        System.out.println(filter.convertToRightPhoneNumber());
    }
}
