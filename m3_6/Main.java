import java.util.Scanner;

public class Main {
    public static void displayParseFIO(String fio) {
        try {
            System.out.println("Name: " + fio.split(" +")[0]);
            System.out.println("Surname: " + fio.split(" +")[1]);
            System.out.println("Last name: " + fio.split(" +")[2]);
        } catch (Exception x) {
            System.err.println(x.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String FIO = in.nextLine();

        displayParseFIO(FIO);
    }
}
